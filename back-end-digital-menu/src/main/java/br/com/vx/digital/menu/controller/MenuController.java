package br.com.vx.digital.menu.controller;

import br.com.vx.digital.menu.dto.DigitalMenuRequestDTO;
import br.com.vx.digital.menu.dto.DigitalMenuResponseDTO;
import br.com.vx.digital.menu.entity.DigitalMenu;
import br.com.vx.digital.menu.repository.DigitalMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private DigitalMenuRepository repository;


    // MÉTODO PARA PUBLICAR UMA NOVA COMIDA NO CARDAPIO
    // nesse caso aqui FAREMOS  O INVERSO -> TRANSFORMAR O DTO NA ENTIDADE
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody DigitalMenuRequestDTO data) {
        DigitalMenu menuData = new DigitalMenu(data);
        repository.save(menuData);
        return;
    }

    /* primeiro endpoint que será criado será o de get que irá retornar todos alimentos
    * que tem no banco de dados */

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<DigitalMenuResponseDTO> getAll(){

        // transformando dados de entidade para DTO

        List<DigitalMenuResponseDTO> digitalMenuList = repository.findAll().stream()
                .map(DigitalMenuResponseDTO::new).toList();

        return digitalMenuList;
    }
}

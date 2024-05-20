package br.com.vx.digital.menu.controller;

import br.com.vx.digital.menu.dto.DigitalMenuResponseDTO;
import br.com.vx.digital.menu.entity.DigitalMenu;
import br.com.vx.digital.menu.repository.DigitalMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private DigitalMenuRepository repository;

    /* primeiro endpoint que será criado será o de get que irá retornar todos alimentos
    * que tem no banco de dados */


    @GetMapping
    public List<DigitalMenuResponseDTO> getAll(){

        // transformando dados de entidade para DTO

        List<DigitalMenuResponseDTO> digitalMenuList = repository.findAll().stream()
                .map(DigitalMenuResponseDTO::new).toList();

        return digitalMenuList;
    }
}

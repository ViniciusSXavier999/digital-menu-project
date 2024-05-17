package br.com.vx.digital.menu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu")
public class MenuController {

    /* primeiro endpoint que será criado será o de get que irá retornar todos alimentos
    * que tem no banco de dados */
    @GetMapping
    public void getAll(){

    }
}

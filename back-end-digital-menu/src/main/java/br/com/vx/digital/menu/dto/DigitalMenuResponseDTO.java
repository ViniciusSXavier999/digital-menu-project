package br.com.vx.digital.menu.dto;

import br.com.vx.digital.menu.entity.DigitalMenu;

public record DigitalMenuResponseDTO(Long id, String title, String image, Integer price) {

    public DigitalMenuResponseDTO(DigitalMenu menu){
        this(menu.getId(), menu.getTitle(), menu.getImage(), menu.getPrice());
    }
}

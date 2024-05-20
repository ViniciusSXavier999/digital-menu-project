package br.com.vx.digital.menu.entity;

import br.com.vx.digital.menu.dto.DigitalMenuRequestDTO;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "tb_menu")
@Entity(name = "tb_menu")
public class DigitalMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String image;

    private Integer price;



    
    // fazendo a conversão para entidade.
    public DigitalMenu(DigitalMenuRequestDTO data){
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();
    }
}

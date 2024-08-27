package br.fiap.mypass.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "passwords")
public class Password {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    private String username;
    private String password;

}

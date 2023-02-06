package com.ecodeup.biblioteca.model;
import com.ecodeup.biblioteca.dto.AutorDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "autores")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombres;
    private String apellidos;
    private String telefono;


    public Autor(AutorDTO  autorDTO) {
        this.id = autorDTO.getId();
        this.nombres = autorDTO.getNombres();
        this.apellidos = autorDTO.getApellidos();
        this.telefono = autorDTO.getTelefono();
    }
}

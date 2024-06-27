package com.aluracursos.forohub.DTO;

import com.aluracursos.forohub.enumerador.Categoria;
import jakarta.validation.constraints.NotBlank;

public record DatosRegistroCurso(
        
        @NotBlank(message = "Nombre requerido") String nombre,
        Categoria categoriaPrincipal,
        String subcategoria
        ) {
}

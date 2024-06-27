package com.aluracursos.forohub.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
        @NotBlank(message = "Titulo requerido") String titulo,
        @NotBlank(message = "Mensaje requerido") String mensaje,
        Long autorId,
        @NotNull Long cursoId
        ) {

    public void setAutorId(Long idAutor) {
        throw new UnsupportedOperationException("Not supported yet.");

    public static record DatosActualizarTopico(
            @NotNull Long id,
            String titulo,
            String mensaje,
            Long cursoId){
        
    }
}

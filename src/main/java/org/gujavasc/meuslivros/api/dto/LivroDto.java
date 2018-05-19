package org.gujavasc.meuslivros.api.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LivroDto {
    private Long id;
    private String titulo;
    private String autor;
    private Long categoriaId;
}

package com.exemplo.cadastro.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "{pessoa.nome.obrigatorio}")
    private String nome;

    @Past(message = "{pessoa.dataNascimento.valida}")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dataNascimento;

    @DecimalMin(value = "0.0", inclusive = false, message = "{pessoa.salario.valido}")
    private BigDecimal salario;

    @Pattern(regexp = "\\(\\d{2}\\)\\d{4,5}-\\d{4}", message = "{pessoa.telefone.valido}")
    private String telefone;
}

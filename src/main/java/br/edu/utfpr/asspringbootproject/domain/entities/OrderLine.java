package br.edu.utfpr.asspringbootproject.domain.entities;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * OrderLine
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderLine {
    private Long id;
    private Item item;
    private Integer quantity;
    private Float subTotal;
}
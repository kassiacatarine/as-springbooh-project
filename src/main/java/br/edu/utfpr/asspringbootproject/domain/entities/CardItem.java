package br.edu.utfpr.asspringbootproject.domain.entities;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CardItem
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CardItem {
    private Item item;
    private Integer quantity;
    private Float subTotal;
}
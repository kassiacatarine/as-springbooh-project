package br.edu.utfpr.asspringbootproject.domain.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Item
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item {
    @Id
    private Long id;
    private String name;
    private String description;
    private Float unitCost;
    private Product product;
    private String imagePath;
}
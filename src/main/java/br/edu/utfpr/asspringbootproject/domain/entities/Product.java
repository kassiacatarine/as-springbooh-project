package br.edu.utfpr.asspringbootproject.domain.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Product
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
    private Long id;
    private String name;
    private String description;
    private Category category;
    private List<Item> items;
}
package br.edu.utfpr.asspringbootproject.domain.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Category
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Category {
    @Id
    private Long id;
    private String name;
    private String description;
    private List<Product> products;
}
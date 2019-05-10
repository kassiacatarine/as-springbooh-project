package br.edu.utfpr.asspringbootproject.domain.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.utfpr.asspringbootproject.domain.entities.Product;

/**
 * ProductRepository
 */
@Repository
public class ProductRepository extends CrudRepository<Product, Long> {

}
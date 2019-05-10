package br.edu.utfpr.asspringbootproject.domain.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.utfpr.asspringbootproject.domain.entities.Order;

/**
 * OderRepository
 * 
 * @param <Order>
 */
@Repository
public class OrderRepository extends CrudRepository<Order, Long> {

}
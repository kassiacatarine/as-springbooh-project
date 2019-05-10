package br.edu.utfpr.asspringbootproject.domain.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Order
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {
    @Id
    private Long id;
    private CreditCard creditCard;
    private Date orderDate;
    private String creditCardNumber;
    private List<OrderLine> orderLines;
    private Float total;
    private Address deliveryAddress;
    private String creditCardExpiryDate;
}
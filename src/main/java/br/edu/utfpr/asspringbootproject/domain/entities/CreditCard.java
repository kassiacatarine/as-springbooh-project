package br.edu.utfpr.asspringbootproject.domain.entities;

import javax.persistence.Entity;

import br.edu.utfpr.asspringbootproject.domain.enums.CreditCardType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CreditCard
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreditCard {
    private String creditCardExpDate;
    private CreditCardType creditCardType;
    private String creditCardNumber;
}
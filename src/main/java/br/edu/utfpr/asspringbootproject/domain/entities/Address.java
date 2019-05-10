package br.edu.utfpr.asspringbootproject.domain.entities;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Address
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {

    private String country;
    private String street1;
    private String city;
    private String state;
    private String street2;
    private String zipCode;
}
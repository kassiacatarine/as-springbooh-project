package br.edu.utfpr.asspringbootproject.domain.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Custumer
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Custumer {
    @Id
    private Long id;
    private String login;
    private String password;
    private String email;
    private Integer age;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String telephone;
    private Address homeAddress;
}
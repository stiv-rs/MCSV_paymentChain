/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paymentchain.customer.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 *
 * @author sotobotero
 */
@Entity
@Data
@Schema(name = "Customer", description = "Class that describe a customer model")
public class Customer {
   @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
   @Schema(name = "name", required = true, example = "name", defaultValue = "name",description = "field that drecribe what is name of the customer")
    private String name;
    private String code;
    private String iban;
    private String names;
    private String surname;
    private String phone;
    private String address; 
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)   
    private List<CustomerProduct> products;
    @Transient
    private List<?> transactions;
}

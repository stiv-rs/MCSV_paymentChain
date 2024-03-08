/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paymentchain.product.entities;

import jakarta.persistence.*;
import lombok.Data;

/**
 *
 * @author sotobotero
 */
@Entity
@Data
public class Product {
   @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
   private long id;
   private String code;
   private String name;
   
}

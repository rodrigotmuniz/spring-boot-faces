/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auth0.samples.bootfaces;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author rodrigo.muniz
 */
public interface ProductRepository extends JpaRepository<Product, Long>{
    
}

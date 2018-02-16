package com.github.xenteros.jhipster.repository;

import com.github.xenteros.jhipster.domain.PizzaOrder;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the PizzaOrder entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PizzaOrderRepository extends JpaRepository<PizzaOrder, Long> {

}

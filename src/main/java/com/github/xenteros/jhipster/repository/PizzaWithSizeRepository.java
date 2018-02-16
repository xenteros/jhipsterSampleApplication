package com.github.xenteros.jhipster.repository;

import com.github.xenteros.jhipster.domain.PizzaWithSize;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the PizzaWithSize entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PizzaWithSizeRepository extends JpaRepository<PizzaWithSize, Long> {

}

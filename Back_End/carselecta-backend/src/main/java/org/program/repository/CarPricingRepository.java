package org.program.repository;

import org.program.entity.CarPricing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarPricingRepository extends JpaRepository<CarPricing, Integer> {
	
	CarPricing findByNewCarNewCarId(int newCarId);
}

package com.masterservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.masterservice.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

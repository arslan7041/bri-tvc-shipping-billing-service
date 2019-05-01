package com.demo.shippingbilling.repositories;

import com.demo.shippingbilling.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface AddressRepository extends JpaRepository<Address,Long> {
    List<Address> findByEmail(String email);

}

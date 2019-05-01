package com.demo.shippingbilling.service;

import com.demo.shippingbilling.models.Address;
import com.demo.shippingbilling.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AddressService {
    AddressRepository addressRepository;


    @Autowired
    AddressService(AddressRepository addressRepository){
        this.addressRepository=addressRepository;

    }
    public void saveUserAddress(Address address){
            addressRepository.save(address);
    }

    public List<Address> getAddressByEmail(String email){
        return addressRepository.findByEmail(email);
    }


}

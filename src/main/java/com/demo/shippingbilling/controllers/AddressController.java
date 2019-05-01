package com.demo.shippingbilling.controllers;

import com.demo.shippingbilling.models.Address;
import com.demo.shippingbilling.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;
    @PostMapping("/address/saveAddress")
    public void saveUserAddress(@RequestBody Address address){
        addressService.saveUserAddress(address);
    }


    @GetMapping("/address/getuserAddress/{email}")
    public List<Address> getAddressByEmail(@PathVariable String email){
       return addressService.getAddressByEmail(email);

    }






}

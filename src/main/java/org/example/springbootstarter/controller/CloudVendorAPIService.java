package org.example.springbootstarter.controller;

import org.example.springbootstarter.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController // Responsible for exposing all REST API points
@RequestMapping("/cloudvendor") // all mappings should start with "/cloudvendor"
public class CloudVendorAPIService {

    CloudVendor cloudVendor;

    @GetMapping({"{vendorID}"})
    public CloudVendor getCloudVendorDetails(String vendorID){
        return cloudVendor;
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor created Successfully" ;

    }
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor updated Successfully" ;

    }

    @DeleteMapping("{vendorID}")
    public String deleteCloudVendorDetails(String vendorID){
        this.cloudVendor = null;
        return "Cloud Vendor deleted Successfully" ;

    }



    
}

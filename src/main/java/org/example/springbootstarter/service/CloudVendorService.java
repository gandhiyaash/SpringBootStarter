package org.example.springbootstarter.service;

import org.example.springbootstarter.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {

    public String createCloudVendor(CloudVendor cloudVendor);

    public String updateCloudVendor(CloudVendor cloudVendor);

    public String deleteCloudVendor(String cloudVendorId);

    public CloudVendor getCloudVendor(String cloudvendorId);

    //TO get all members

    public List<CloudVendor> getAllCloudVendors();


}

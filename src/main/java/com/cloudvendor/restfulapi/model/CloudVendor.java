package com.cloudvendor.restfulapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cloud_vendor_info")
public class CloudVendor {
    @Id
    private String vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorPh;

    public String getVendorId() {
        return vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }
    public String getVendorPh() {
        return vendorPh;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public void setVendorPh(String vendorPh) {
        this.vendorPh = vendorPh;
    }


    public CloudVendor(String vendorId) {
        this.vendorId = vendorId;
    }

    public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPh) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPh = vendorPh;
    }
}

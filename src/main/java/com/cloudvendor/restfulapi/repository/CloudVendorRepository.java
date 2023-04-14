package com.cloudvendor.restfulapi.repository;


import com.cloudvendor.restfulapi.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {

}

package com.sirier.dao;

import com.sirier.domain.Region;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RegionDao extends JpaRepository<Region,String>, JpaSpecificationExecutor<Region> {
    //hello
}
package com.kyc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kyc.entity.SD_KYC_FIELD_TYPES;
import com.kyc.entity.SD_KYC_GROUPS;

@Repository
public interface SD_KYC_GROUPS_Repository extends  JpaRepository<SD_KYC_GROUPS, Integer>{

}

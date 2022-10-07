package com.kyc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kyc.bean.SD_KYC_FIELD_TYPES_Bean;
import com.kyc.entity.SD_KYC_FIELD_MASTER;
import com.kyc.entity.SD_KYC_FIELD_TYPES;

@Repository
public  interface SD_KYC_FIELD_TYPES_Repository extends  JpaRepository<SD_KYC_FIELD_TYPES, Integer>{

}

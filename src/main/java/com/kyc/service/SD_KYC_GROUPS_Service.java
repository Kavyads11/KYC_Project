package com.kyc.service;

import com.kyc.entity.SD_KYC_FIELD_TYPES;
import com.kyc.entity.SD_KYC_GROUPS;

public interface SD_KYC_GROUPS_Service {
	public SD_KYC_GROUPS add(SD_KYC_GROUPS master);
	public SD_KYC_GROUPS update(SD_KYC_GROUPS master);
	public String delete(int id);
	public SD_KYC_GROUPS  get(int id);

}

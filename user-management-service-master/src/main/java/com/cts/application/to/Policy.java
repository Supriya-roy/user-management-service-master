package com.cts.application.to;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Document
public class Policy {
	//@Id
	//String userPolicyId;
	String policyId;
	// String policyName;
	float amountPaid;
	Date policyEndDate;
	/*boolean isValid;*/
	
	/*public String getUserPolicyId() {
		return userPolicyId;
	}
	public void setUserPolicyId(String userPolicyId) {
		this.userPolicyId = userPolicyId;
	}*/
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	/*public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}*/
	public float getAmountPaid() {
		return amountPaid;
	}
	/*public boolean isValid() {
		return isValid;
	}
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}*/
	public void setAmountPaid(float amountPaid) {
		this.amountPaid = amountPaid;
	}
	public Date getPolicyEndDate() {
		return policyEndDate;
	}
	public void setPolicyEndDate(Date policyEndDate) {
		this.policyEndDate = policyEndDate;
	}
	
	
	
}

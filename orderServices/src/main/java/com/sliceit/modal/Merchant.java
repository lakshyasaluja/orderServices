package com.sliceit.modal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Merchant {
private int merchantId;
private String merchantName;
private String merchantEmail;
private long merchantPhoneNo;
public Merchant()
{
	
}
public Merchant(int merchantId, String merchantName, String merchantEmail,
		long merchantPhoneNo) {
	super();
	this.merchantId = merchantId;
	this.merchantName = merchantName;
	this.merchantEmail = merchantEmail;
	this.merchantPhoneNo = merchantPhoneNo;
}
public int getMerchantId() {
	return merchantId;
}
public void setMerchantId(int merchantId) {
	this.merchantId = merchantId;
}
public String getMerchantName() {
	return merchantName;
}
public void setMerchantName(String merchantName) {
	this.merchantName = merchantName;
}
public String getMerchantEmail() {
	return merchantEmail;
}
public void setMerchantEmail(String merchantEmail) {
	this.merchantEmail = merchantEmail;
}
public long getMerchantPhoneNo() {
	return merchantPhoneNo;
}
public void setMerchantPhoneNo(long merchantPhoneNo) {
	this.merchantPhoneNo = merchantPhoneNo;
}

}

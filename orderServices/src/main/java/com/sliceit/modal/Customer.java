package com.sliceit.modal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
private int cusId;
private String custName;
private String custEmial;
private long custPhoneNo;
private Customer()
{
	
}
public Customer(int cusId, String custName, String custEmial, long custPhoneNo) {
	super();
	this.cusId = cusId;
	this.custName = custName;
	this.custEmial = custEmial;
	this.custPhoneNo = custPhoneNo;
}

public int getCusId() {
	return cusId;
}
public void setCusId(int cusId) {
	this.cusId = cusId;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public String getCustEmial() {
	return custEmial;
}
public void setCustEmial(String custEmial) {
	this.custEmial = custEmial;
}
public long getCustPhoneNo() {
	return custPhoneNo;
}
public void setCustPhoneNo(long custPhoneNo) {
	this.custPhoneNo = custPhoneNo;
}


}

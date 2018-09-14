package com.sliceit.modal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProductDetails {
private int productId;
private String productName;
private int productAmt;
private int installmentPaid;
private String productPaymentStatus;
private String productDescp;
public ProductDetails()
{
	
}
public ProductDetails(int productId, String productName, int productAmt,
		int installmentPaid, String productPaymentStatus, String productDescp) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productAmt = productAmt;
	this.installmentPaid = installmentPaid;
	this.productPaymentStatus = productPaymentStatus;
	this.productDescp = productDescp;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getProductAmt() {
	return productAmt;
}
public void setProductAmt(int productAmt) {
	this.productAmt = productAmt;
}
public int getInstallmentPaid() {
	return installmentPaid;
}
public void setInstallmentPaid(int installmentPaid) {
	this.installmentPaid = installmentPaid;
}
public String getProductPaymentStatus() {
	return productPaymentStatus;
}
public void setProductPaymentStatus(String productPaymentStatus) {
	this.productPaymentStatus = productPaymentStatus;
}
public String getProductDescp() {
	return productDescp;
}
public void setProductDescp(String productDescp) {
	this.productDescp = productDescp;
}


}

package com.sliceit.modal;

import java.sql.Time;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Order {
	private int sliceItOrderId;
	private String orderTime;
	private int orderTotal;
	private int orderTotalPaid;
	private int orderTotalOwing;
	private int orderQual;
	private String orderDeliveryAddress;
	private Customer customer;
	private Merchant merchant;
	private ProductDetails productDetails;
	private String firstDate;
	private String secondDate;
	private String thirdDate;
	private String fourthDate;

	public Order()
	{
		
	}

	public Order(int sliceItOrderId, String orderTime, int orderTotal, int orderTotalPaid, int orderTotalOwing,
			int orderQual, String orderDeliveryAddress, Customer customer, Merchant merchant,
			ProductDetails productDetails, String firstDate, String secondDate, String thirdDate, String fourthDate) {
		super();
		this.sliceItOrderId = sliceItOrderId;
		this.orderTime = orderTime;
		this.orderTotal = orderTotal;
		this.orderTotalPaid = orderTotalPaid;
		this.orderTotalOwing = orderTotalOwing;
		this.orderQual = orderQual;
		this.orderDeliveryAddress = orderDeliveryAddress;
		this.customer = customer;
		this.merchant = merchant;
		this.productDetails = productDetails;
		this.firstDate = firstDate;
		this.secondDate = secondDate;
		this.thirdDate = thirdDate;
		this.fourthDate = fourthDate;
	}

	public int getSliceItOrderId() {
		return sliceItOrderId;
	}

	public void setSliceItOrderId(int sliceItOrderId) {
		this.sliceItOrderId = sliceItOrderId;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public int getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(int orderTotal) {
		this.orderTotal = orderTotal;
	}

	public int getOrderTotalPaid() {
		return orderTotalPaid;
	}

	public void setOrderTotalPaid(int orderTotalPaid) {
		this.orderTotalPaid = orderTotalPaid;
	}

	public int getOrderTotalOwing() {
		return orderTotalOwing;
	}

	public void setOrderTotalOwing(int orderTotalOwing) {
		this.orderTotalOwing = orderTotalOwing;
	}

	public int getOrderQual() {
		return orderQual;
	}

	public void setOrderQual(int orderQual) {
		this.orderQual = orderQual;
	}

	public String getOrderDeliveryAddress() {
		return orderDeliveryAddress;
	}

	public void setOrderDeliveryAddress(String orderDeliveryAddress) {
		this.orderDeliveryAddress = orderDeliveryAddress;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

	public ProductDetails getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(ProductDetails productDetails) {
		this.productDetails = productDetails;
	}

	public String getFirstDate() {
		return firstDate;
	}

	public void setFirstDate(String firstDate) {
		this.firstDate = firstDate;
	}

	public String getSecondDate() {
		return secondDate;
	}

	public void setSecondDate(String secondDate) {
		this.secondDate = secondDate;
	}

	public String getThirdDate() {
		return thirdDate;
	}

	public void setThirdDate(String thirdDate) {
		this.thirdDate = thirdDate;
	}

	public String getFourthDate() {
		return fourthDate;
	}

	public void setFourthDate(String fourthDate) {
		this.fourthDate = fourthDate;
	}
	
		
}

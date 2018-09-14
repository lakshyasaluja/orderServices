package com.sliceit.orderServices;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.sliceit.modal.Customer;
import com.sliceit.modal.Merchant;
import com.sliceit.modal.Order;
import com.sliceit.modal.ProductDetails;



@Path("orderInfo")
public class MyResource {

	@GET
	@Path("/{orderId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Order getOrderInfo(@PathParam("orderId")int orderId,@Context HttpServletResponse response)
	{
		Customer customer=new Customer(1, "kapil", "kapil@gmail.com", 9979793234L);
		Merchant merchant=new Merchant(99, "Apple Store", "apple@gmail.com", 8454793234L);
		ProductDetails productDetails=new ProductDetails(50, "IPhone", 60000, 1,"not paid", "it is a great phone");
		Order order=new Order(orderId, "12:30", 80000, 20000, 35000, 1, "indrapuram cloud-9 G1401", customer, merchant, productDetails,"10/09/2018", "10/10/2018","10/11/2018","10/12/2018");
		response.setHeader("Access-Control-Allow-Origin","*");
		return order;
	}
}

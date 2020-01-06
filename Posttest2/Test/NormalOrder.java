package com.Test;

public class NormalOrder extends Order implements dispatch, receive {
	public void receivedByCustomer()
	{
		System.out.println("Received By Customer");
	}
	public void dispatchtoCustmer() {
		System.out.println("dispatched to Customer");
	}
	public void confirm()
	{
		System.out.println("Order confirmed");
	}
	public void close() {
		System.out.println("Order Closed");
		
	}

}

package com.Test;



public class SpecialOrder extends Order implements dispatch {
	@Override
	public void confirm()
	{
		System.out.println("Order Confirmed");
	}
	@Override
	public void close()
	{
		System.out.println("Order Closed");
	}
	@Override
	public void dispatchtoCustmer() {
		// TODO Auto-generated method stub
		System.out.println("Delivered to customer");
		
	}
	

}



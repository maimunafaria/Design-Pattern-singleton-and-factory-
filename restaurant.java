package singleton_factory;

import java.util.ArrayList;

public class restaurant {
	static restaurant restaurentName = new restaurant();
	ArrayList<Order>orders=new ArrayList<>();
	private restaurant()
	{}
	public static restaurant getObject()
	{
		return restaurentName;
	}
	public void add(Order order)
	{
		orders.add(order);
	}
	public void print()
	{
		System.out.println(orders.size());
	}
	
}

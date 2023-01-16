package singleton_factory;

public class pizza implements Order{

	@Override
	public Order getObject() {
		return new pizza();
	}

	@Override
	public void getOrder() {
		restaurant r = restaurant.getObject();
		r.add(getObject());	
		r.print();
	}

	@Override
	public String getName() {
		return "pizza";
	}
	

}

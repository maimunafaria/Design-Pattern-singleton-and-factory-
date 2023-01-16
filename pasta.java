package singleton_factory;

public class pasta implements Order {

	@Override
	public Order getObject() {
		return new pasta();
	}

	@Override
	public void getOrder() {
			restaurant r = restaurant.getObject();
			r.add(getObject());	
			r.print();
	}

	@Override
	public String getName() {
		return "pasta";
	}
	

}

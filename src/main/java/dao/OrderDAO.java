package dao;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import model.entity.Order;

public class OrderDAO {
	
	public List<Order> orders = new CopyOnWriteArrayList<>();
	
	public void save(Order order) {
		orders.add(order);
	}
	
	public List<Order> findAll() {
		
		return orders;
	}
	
	public void remove(String index) {
		orders.remove(index);
	}

}

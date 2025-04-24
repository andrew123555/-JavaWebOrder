package service;

import dao.OrderDAO;
import model.dto.OrderDTO;
import model.entity.Order;

public class OrderService {
	OrderDAO orderDAO = new OrderDAO();
	
	public OrderDTO addOrder(String item) {
		
		Order order = new Order();
		order.setItem(item);
		order.setPrice(100);
		orderDAO.save(order);
		OrderDTO orderDTO = new OrderDTO();
		orderDTO.setMessage("您點了"+order.getItem()+ "總共"+ order.getPrice()+"元");
		
		return orderDTO;
		
	}
	
	public OrderDTO removeOrder(String index) {
		
		
		orderDAO.remove(index);
		OrderDTO orderDTO = new OrderDTO();
		orderDTO.setMessage("資料刪除成功");
		
		return orderDTO;
	}
	
}

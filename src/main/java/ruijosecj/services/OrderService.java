package ruijosecj.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ruijosecj.dto.OrderDTO;
import ruijosecj.entities.Order;
import ruijosecj.repositories.OrderRepository;
import ruijosecj.services.exceptions.ResourceNotFoundException;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	@Transactional(readOnly = true)
	public OrderDTO findById(Long id) {
		Order order = repository.findById(id).orElseThrow( 
				()-> new ResourceNotFoundException("Recurso não encontrado!"));
		return new OrderDTO(order);
		
	}
}

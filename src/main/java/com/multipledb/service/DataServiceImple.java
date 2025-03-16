package com.multipledb.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.multipledb.entity.Order;
import com.multipledb.entity.User;
import com.multipledb.payload.OrderDTO;
import com.multipledb.payload.UserDTO;
import com.multipledb.repository.OrderRepository;
import com.multipledb.repository.UserRepository;

@Service
public class DataServiceImple implements DataService {

	private final UserRepository userRepository;

	private final OrderRepository orderRepository;
	private final ModelMapper modelMapper;

	public DataServiceImple(UserRepository userRepository, OrderRepository orderRepository, ModelMapper modelMapper) {
		this.userRepository = userRepository;
		this.orderRepository = orderRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	public UserDTO saveUser(UserDTO userDTO) {
		// Map the UserDTO to User
		User user = modelMapper.map(userDTO, User.class);
		// Save the User entity to the database
		User saveuser = userRepository.save(user);
		// Map the saved User entity back to UserDTO and return it
		return modelMapper.map(saveuser, UserDTO.class);
	}

	@Override
	public OrderDTO saveOrder(OrderDTO orderDTO) {
		// Map the OrderDTO to Order
		Order orders = modelMapper.map(orderDTO, Order.class);
		// Save the Order entity to the database
		Order saveOrders = orderRepository.save(orders);
		// Map the saved Order entity back to OrderDTO and return it
		return modelMapper.map(saveOrders, OrderDTO.class);
	}

}

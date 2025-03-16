package com.multipledb.service;

import com.multipledb.payload.OrderDTO;
import com.multipledb.payload.UserDTO;

public interface DataService {

	UserDTO saveUser(UserDTO userDTO);

	OrderDTO saveOrder(OrderDTO orderDTO);

}

package com.multipledb.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multipledb.payload.OrderDTO;
import com.multipledb.payload.UserDTO;
import com.multipledb.service.DataService;

@RestController
@RequestMapping("/api")
public class DataController {
	
	private final DataService dataService;
	
	public DataController(DataService dataService) {
		this.dataService=dataService;
	}
	
	// Endpoint to save User
	@PostMapping("/users")
	public ResponseEntity<UserDTO> saveUser(@RequestBody  UserDTO userDTO){
		UserDTO saveUser = dataService.saveUser(userDTO);
		return new ResponseEntity<>(saveUser,HttpStatus.CREATED);
	}
	//EndPoint to save Order
	@PostMapping("/orders")
	public ResponseEntity<OrderDTO> saveOrder(@RequestBody OrderDTO orderDTO){
		OrderDTO saveOrder = dataService.saveOrder(orderDTO);
		return new ResponseEntity<>(saveOrder,HttpStatus.CREATED);
	}
	

}

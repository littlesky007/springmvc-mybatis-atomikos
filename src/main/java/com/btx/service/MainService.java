package com.btx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.btx.dao.PersonDao;
import com.btx.dao2.OrderDao;
import com.btx.domain.Orders;
import com.btx.domain.Person;

/**
 * 
 * @author littlesky
 *
 */
@Service
public class MainService {
	
	public MainService() {
		System.out.println("kkkkk");
	}
	
	@Autowired
	private PersonDao personDao;
	
	@Autowired
	private OrderDao orderDao;
	
	@Transactional(rollbackFor=Exception.class)
	public boolean dealService(boolean excepFlage) throws Exception
	{
		Person person = new Person();
		person.setName("Ð¡Îå");
		person.setAge(25);
		personDao.addPerson(person);
		
		
		Orders order = new Orders();
		order.setName("Ì¨µÆ");
		orderDao.addOrder(order);
		
		
		
		if(excepFlage)
		{
			throw new Exception();
		}
		return excepFlage;
	}
}

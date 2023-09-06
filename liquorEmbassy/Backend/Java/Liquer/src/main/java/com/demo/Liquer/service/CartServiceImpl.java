package com.demo.Liquer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Liquer.bean.Orders;
import com.demo.Liquer.dao.CartDao;
@Service
public class CartServiceImpl implements CartService
{ 
	@Autowired
	private CartDao cartdao;
 
	@Override
	public int addOrderOfCart(Orders order) {
		
		try
		{
	            cartdao.save(order);
	            return 1;
	    }
		catch(Exception e)
		{
			
			return -1;
		}
	
	}

}

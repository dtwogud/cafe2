package com.shop.cafe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.cafe.dao.ProductDao;
import com.shop.cafe.dto.Product;

@Service
public class ProductService {
	@Autowired  //자동으로 new 안하고 생성 -> productDao @component 선언
	ProductDao productDao;
	
	public List<Product> getAllProducts() throws Exception{
		return productDao.getAllProducts();
	}
}

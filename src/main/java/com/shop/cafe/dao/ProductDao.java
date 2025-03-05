package com.shop.cafe.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.shop.cafe.dto.Product;

@Repository
public class ProductDao {
	
	//6단계 코드를 위해 정보를 가져옴
	@Value("${spring.datasource.driver-class-name}")
	private String DB_DRIVER;
	@Value("${spring.datasource.url}")
	private String DB_URL;
	@Value("${spring.datasource.username}")
	private String DB_USER;
	@Value("${spring.datasource.password}")
	private String DB_PW;
	
	//기능 위주의 클래스
	public List<Product> getAllProducts() throws Exception {
		String sql = "select * from product";
		//JDBC 6단계 코드
		Class.forName(DB_DRIVER);
		
		try (//auto closable 객체만 소괄호에 넣어줌
			Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PW);
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			) {
				List<Product> list=new ArrayList<>();
				
				while(rs.next()) {
					int prodcode = rs.getInt("prodcode");
					String prodname = rs.getString("prodname");
					String pimg = rs.getString("pimg");
					int price = rs.getInt("price");
				
					list.add(new Product(prodcode, price, prodname, pimg));
				}
				return list;
		}
		
		
		
	}

}

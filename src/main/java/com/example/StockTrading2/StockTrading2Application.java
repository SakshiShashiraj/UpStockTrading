package com.example.StockTrading2;

import com.example.StockTrading2.model.Customer;
import com.example.StockTrading2.model.Stock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StockTrading2Application {

	public static void main(String[] args) {
		SpringApplication.run(StockTrading2Application.class, args);
		Customer John = new Customer("John Doe");
		John.addFunds(1000);
		Stock Nvidia = new Stock("Nvidia", 50, 200);
		John.buy(Nvidia, 10);
		System.out.println(John.generateStatement());
		System.out.println(Nvidia.toString());
	}

}

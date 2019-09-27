package com.trama.mystore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.trama.mystore.chart.Chart;
import com.trama.mystore.chart.Item;

@SpringBootApplication
public class StoreApplication {

	private Chart chart;

	@Bean
    public Chart chart() {
        return this.chart;
	}

	public StoreApplication() {
		this.chart = new Chart();
		// Load example data
		this.chart.addItem(new Item("Iphone X 64gb", 999.99));
		this.chart.addItem(new Item("Adidas Shoes 42", 129.99));
		this.chart.addItem(new Item("Wireless Router TP-Link", 99.99));
	}

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}

}

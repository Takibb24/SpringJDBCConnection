package com.thenerd.SpringJDBCcon;

import com.thenerd.SpringJDBCcon.model.Bikers;
import com.thenerd.SpringJDBCcon.service.BikerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@SpringBootApplication
public class SpringJdbCconApplication {

	public static <bikers> void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbCconApplication.class, args);
		Bikers bk = context.getBean(Bikers.class);
		bk.setId(05);
		bk.setName("karim");
		bk.setTops(122);
		BikerService bs = context.getBean(BikerService.class);
		bs.addBikers(bk);
		List<Bikers> Bikerss = bs.getBikerss();
		System.out.println(Bikerss);
		//this is to create a list of bikers and declare get method to BikerService class

	}

}

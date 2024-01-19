package com.ashokit;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
	
	//create temp method
	
	public void test(){
		
		System.out.println("hello java ");
	}
	
	
	public void test1(int a){
		
		System.out.println(20);
	}
	
	
	//2nd method
	public void test2(int b){
		
		System.out.println(40);
		
	}
	
	
	//hello
	
	
	
	
	
	

}

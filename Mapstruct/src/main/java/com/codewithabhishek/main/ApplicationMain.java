package com.codewithabhishek.main;

import org.mapstruct.factory.Mappers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codewithabhishek.beans.YourFriendInformation;
import com.codewithabhishek.beans.YourInformation;
import com.codewithabhishek.mapper.Mappersinter;


/**
 * @author  Code with abhishek
 *
 */
@SpringBootApplication
@RestController
public class ApplicationMain {
	
	
	private Mappersinter  domap = Mappers.getMapper(Mappersinter.class);
	
	
	
	
	
	@RequestMapping("/codewithabhishek")
	public String main()  {
		
		YourInformation yourInformation = new YourInformation();
		
		yourInformation.setYourName("Abhishek");
		yourInformation.setYourLastName("Singh");
		
		
		
		YourFriendInformation yourFriendInformation = domap.getYourFriendInformation(yourInformation);
		
		return "success"+"         "+"your friend information after mapping"+"       "+yourFriendInformation.getYourFriendsName() +yourFriendInformation.getYourFriendLastName();
	}
	
	   
	
	
	
	
	
	   public static void main(String[] args) {
		   
		   
		   SpringApplication.run(ApplicationMain.class, args);
	   }

}

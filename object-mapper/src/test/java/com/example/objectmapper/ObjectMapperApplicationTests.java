package com.example.objectmapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
class ObjectMapperApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		System.out.println("-----------------");
		
		// Text JSON -> Object
		// Object -> Text JSON
		
		// controller reqeust json(text) -> object
		// response object -> json(text)
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		// object -> text
		// object mapper 가 get method 를 활욯한다.
		User user = new User("홍길동", 33);
		String text = objectMapper.writeValueAsString(user);
		System.out.println(text);
		
		// text -> object
		User objectUser = objectMapper.readValue(text, User.class);
		System.out.println(objectUser);
	}

}

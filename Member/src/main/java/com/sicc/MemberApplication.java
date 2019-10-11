package com.sicc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Web MVC, RestTemplate, RestController 만
 * Member -> Work 호출 (DB 없음)
 * @author Woongs
 */
@SpringBootApplication
public class MemberApplication {

    @Bean
    public RestTemplate getRestTemplate() {
        RestTemplate template = new RestTemplate();
        return template;
    }
	
	public static void main(String[] args) {
		SpringApplication.run(MemberApplication.class, args);
	}

}

package com.thinkpad.wbdjavaexamc0718G1vutiendat;

import com.thinkpad.wbdjavaexamc0718G1vutiendat.service.EmployeeService;
import com.thinkpad.wbdjavaexamc0718G1vutiendat.service.EmployeeServiceImpl;
import com.thinkpad.wbdjavaexamc0718G1vutiendat.service.GroupEmployeeService;
import com.thinkpad.wbdjavaexamc0718G1vutiendat.service.GroupEmployeeServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WbdjavaExamC0718G1VutiendatApplication {
	@Bean
	public EmployeeService employeeService() {
		return new EmployeeServiceImpl();
	}

	@Bean
	public GroupEmployeeService groupEmployeeService() {
		return new GroupEmployeeServiceImpl();
	}

	public static void main(String[] args) {
		SpringApplication.run(WbdjavaExamC0718G1VutiendatApplication.class, args);
	}
}

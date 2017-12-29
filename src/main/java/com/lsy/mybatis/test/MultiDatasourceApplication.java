package com.lsy.mybatis.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = "classpath*:spring/*.xml")
public class MultiDatasourceApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MultiDatasourceApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(MultiDatasourceApplication.class, args);
	}
}

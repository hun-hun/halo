package com.halo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// com.halo.dao 接口扫描
@MapperScan(basePackages = "com.halo.dao")
public class HaloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HaloApplication.class, args);
	}

}

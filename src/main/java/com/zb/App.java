package com.zb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
	
@EnableAutoConfiguration
//这里扫描com.jzj.controller里的文件，目录如果不一样记得改
@ComponentScan(value = {"com.zb.controller"}) 
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}

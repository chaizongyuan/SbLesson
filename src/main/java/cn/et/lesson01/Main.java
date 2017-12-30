package cn.et.lesson01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import cn.et.lesson01.controller.SbController;

//必须添加SpringBootApplication 启用spring的自动配置功能
@SpringBootApplication
public class Main {
	/**
	 * just run springboot启动的方法
	 */
	public static void main(String[] args) {
		//启动会加载自动配置 
		SpringApplication.run(SbController.class, args);
	}
}

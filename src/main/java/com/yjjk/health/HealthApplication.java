package com.yjjk.health;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
public class HealthApplication {

//	public static class CustomGenerator implements BeanNameGenerator {
//
//		@Override
//		public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
//			return definition.getBeanClassName();
//		}
//	}

	public static void main(String[] args) {
//		new SpringApplicationBuilder(MonitorApplication.class)
//				.beanNameGenerator(new CustomGenerator())
//				.run(args);
    	SpringApplication.run(HealthApplication.class, args);
	}

}

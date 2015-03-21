package net.equj65.rest;

import org.glassfish.jersey.servlet.ServletContainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class App {
	
	@Bean
	public ServletRegistrationBean jerseyServlet() {
		ServletRegistrationBean servletBean = new ServletRegistrationBean(
				new ServletContainer(), "/*");
		servletBean.addInitParameter(
				"javax.ws.rs.Application", JerseyConfig.class.getName());
		return servletBean;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}

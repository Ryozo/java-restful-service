package net.equj65.rest;

import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class App {
	
	/**
	 * Jersey用Servletの設定.
	 * 従来のweb.xmlに相当する処理を記述.
	 * @return JerseyServlet情報を保持する{@link ServletRegistrationBean}
	 */
	@Bean
	public ServletRegistrationBean jerseyServlet() {
		ServletRegistrationBean servletBean = new ServletRegistrationBean(
				new ServletContainer(), "/*");
		servletBean.addInitParameter(
				ServletProperties.JAXRS_APPLICATION_CLASS, JerseyConfig.class.getName());
		return servletBean;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}

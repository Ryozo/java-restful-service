package net.equj65.rest;

import net.equj65.rest.entity.Person;
import net.equj65.rest.repository.PersonRepository;

import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App implements CommandLineRunner {
	
	/** DB初期化のためにRepositoryをInjection */
	@Autowired
	PersonRepository repository;
	
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
	
	/**
	 * DBに対して初期データを投入
	 */
	@Override
	public void run(String... arg0) throws Exception {
		repository.save(new Person("person1", 10));
		repository.save(new Person("person2", 20));
		repository.save(new Person("person3", 30));
		repository.save(new Person("person4", 40));
	}
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}

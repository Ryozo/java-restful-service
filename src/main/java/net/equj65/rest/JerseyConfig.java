package net.equj65.rest;

import javax.imageio.spi.RegisterableService;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;
import org.springframework.context.annotation.Configuration;

/**
 * JAX-RS(Jsersey)の設定を行うJavaConfig.
 * @author ryozo
 *
 */
@Configuration
public class JerseyConfig extends ResourceConfig {
	/**
	 * Jerseyリソースの設定。
	 */
	public JerseyConfig() {
		register(JacksonFeature.class);
		register(RequestContextFilter.class);
		packages("net.equj65.rest");
		register(LoggingFilter.class);
	}
}

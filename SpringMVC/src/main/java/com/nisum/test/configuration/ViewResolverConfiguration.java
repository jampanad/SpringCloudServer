package com.nisum.test.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
public class ViewResolverConfiguration extends WebMvcConfigurerAdapter{
	@Bean
	    public ViewResolver getViewResolver() {
	        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	        resolver.setPrefix("/WEB-INF/views/");
	       // resolver.setViewNames("views/**");
	        resolver.setSuffix(".jsp");
	        return resolver;
	    }
	 
	 @Override
	    public void configureDefaultServletHandling(
	            DefaultServletHandlerConfigurer configurer) {
	        configurer.enable();
	    }
	
}

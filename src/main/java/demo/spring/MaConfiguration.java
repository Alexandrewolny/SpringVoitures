package demo.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MaConfiguration {
	
	@Bean
	public String marque() {
		return "Tesla";
	}
	
	@Bean 
	public String couleur() {
		return "Rouge";
	}
	
	@Bean
	public String puissance() {
		return "75CV";
	}
	
	

}

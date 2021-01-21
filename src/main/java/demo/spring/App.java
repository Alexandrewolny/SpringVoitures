package demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("demo.spring")
public class App {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		
		Voiture voiture = context.getBean(Voiture.class);
		Voiture voiture1 = context.getBean(Voiture.class);
		Voiture voiture2 = context.getBean(Voiture.class);
		Voiture voiture3 = context.getBean(Voiture.class);
		Voiture voiture4 = context.getBean(Voiture.class);
		Voiture voiture5 = context.getBean(Voiture.class);
		
		voiture5.setCouleur("vert");
		
		System.out.println(voiture);
		System.out.println(voiture1);
		System.out.println(voiture2);
		System.out.println(voiture3);
		System.out.println(voiture4);
		System.out.println(voiture5);
		
	}

	
}
	

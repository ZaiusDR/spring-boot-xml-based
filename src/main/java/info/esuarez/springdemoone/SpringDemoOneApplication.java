package info.esuarez.springdemoone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringDemoOneApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach theCoach = context.getBean("myCoach", Coach.class);

		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		boolean result = (theCoach == alphaCoach);

		System.out.println("\nPointing to the same object: " + result);

		System.out.println("\nMemory location for the Coach: " + theCoach);

		System.out.println("\nMemory location for alpha Coach: " + alphaCoach + "\n");

		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());

		context.close();

		SpringApplication.run(SpringDemoOneApplication.class, args);
	}

}

package springjpa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebAutoConfiguration;

@SpringBootApplication(exclude = SpringDataWebAutoConfiguration.class)
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    SpringApplication.run(Application.class, args);
	}

}

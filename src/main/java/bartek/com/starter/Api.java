package bartek.com.starter;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("bartek.com")
public class Api {
    public static void main(String[] args) {
        SpringApplication.run(Api.class, args);
    }
}

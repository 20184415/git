package study.guestbooktest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class GuestbooktestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuestbooktestApplication.class, args);
    }

}

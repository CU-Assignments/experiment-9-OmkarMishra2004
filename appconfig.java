import org.springframework.context.annotation.*;

@Configuration
public class AppConfig {

    @Bean
    public Course course() {
        return new Course("Java Development", 10);
    }

    @Bean
    public Student student() {
        return new Student("Omkar Mishra", course());
    }
}

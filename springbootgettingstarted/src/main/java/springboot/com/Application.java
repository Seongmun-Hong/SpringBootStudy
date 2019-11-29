package springboot.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springboot.study.Student;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    public Student student() {
//        Student student = new Student();
//        student.setName("Hong");
//        student.setStudentNumber(54321);
//        return student;
//    }

}

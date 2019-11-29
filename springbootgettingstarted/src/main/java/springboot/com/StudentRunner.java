package springboot.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;
import springboot.study.Student;

@Configuration
public class StudentRunner implements ApplicationRunner {

    final
    Student student;

    public StudentRunner(Student student) {
        this.student = student;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(student.toString());
    }
}

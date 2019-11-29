package springboot.study;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(StudentProperties.class)
public class StudentConfiguration {

    @Bean
    @ConditionalOnMissingBean
    Student student(StudentProperties properties) {
        Student student = new Student();
        student.setName(properties.getName());
        student.setStudentNumber(properties.getStudentNumber());
        return student;
    }

}

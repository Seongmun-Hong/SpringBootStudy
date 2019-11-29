package springboot.study;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("student")
public class StudentProperties {
    private String name;
    private int studentNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
}

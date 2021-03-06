package spring.study.settings;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
class SettingsApplicationTests {

    @Autowired
    Environment environment;

    @Test
    void contextLoads() {
        assertThat(environment.getProperty("developer.name"))
                .isEqualTo("seongmun");
    }

}

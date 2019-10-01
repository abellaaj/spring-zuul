package fr.aiman.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import fr.aiman.spring.config.ResourceServerApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ResourceServerApplication.class)
public class SpringContextIntegrationTest {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}

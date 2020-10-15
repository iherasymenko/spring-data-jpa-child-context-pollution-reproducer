package com.example;

import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextHierarchy({
        @ContextConfiguration(classes = RootConfiguration.class),
        @ContextConfiguration(classes = Config2Test.Config.class)
})
public class Config2Test {

    @Configuration
    @EnableJpaRepositories(basePackages = "com.example.repository")
    public static class Config {

    }

    @Autowired
    private EntityManager entityManager;

    @Test
    public void testSomething() {
        assertNotNull(entityManager);
    }
}

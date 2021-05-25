package com.baeldung.lsd;

import com.baeldung.lsd.persistence.repository.IProjectRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestingRepositoriesApp implements ApplicationRunner {

    private static final Logger LOG = LoggerFactory.getLogger(TestingRepositoriesApp.class);

    @Autowired
    private IProjectRepository projectRepository;

    public static void main(final String... args) {
        SpringApplication.run(TestingRepositoriesApp.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }

}
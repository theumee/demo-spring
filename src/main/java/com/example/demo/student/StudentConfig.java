package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student jamal = new Student(
                    1L,
                    "JAMAL",
                    "jamal@gmail.com",
                    LocalDate.of(2000, JANUARY, 17)
            );

            Student alex = new Student(
                    "ALEX",
                    "alex@yahoo.com",
                    LocalDate.of(2004, JANUARY, 17)
            );

            studentRepository.saveAll(
                    List.of(jamal,alex)
            );
        };
    }
}

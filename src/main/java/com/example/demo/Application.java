package com.example.demo;

import com.example.demo.models.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student manpreet = new Student("Manpreet","Singh","manpreetkamboj60.net@gmail.com",22);
            Student testUser1 = new Student("Test","User1","testuser1@gmail.com",18);
            Student testUser2 = new Student("Test","User2","testuser2@gmail.com",20);
            studentRepository.save(manpreet);
            studentRepository.save(testUser1);
            studentRepository.save(testUser2);
        };
    }

}

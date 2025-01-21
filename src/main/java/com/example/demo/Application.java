package com.example.demo;

import com.example.demo.models.Book;
import com.example.demo.models.Student;
import com.example.demo.repository.BookRepository;
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
    CommandLineRunner commandLineRunner(StudentRepository studentRepository, BookRepository bookRepository){
        return args -> {
            Student manpreet = new Student("Manpreet","Singh","manpreetkamboj60.net@gmail.com",22);
            Student testUser1 = new Student("Test","User1","testuser1@gmail.com",18);
            Student testUser2 = new Student("Test","User2","testuser2@gmail.com",20);
            Book book1 = new Book("Marvel Avengers","Stanlee",999.99);
            Book book2 = new Book("Marvel Iron Man","Stanlee",499.00);
            Book book3 = new Book("Batma: The Dark Knight","DC Comics",399.00);
            Book book4 = new Book("Superman: The man of steel","DC Comics",449.00);
            studentRepository.save(manpreet);
            studentRepository.save(testUser1);
            studentRepository.save(testUser2);
            bookRepository.save(book1);
            bookRepository.save(book2);
            bookRepository.save(book3);
            bookRepository.save(book4);
        };
    }

}

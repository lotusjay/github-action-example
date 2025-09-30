package com.example.unit_testing2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UnitTesting2Application {
//    echo "# github-action-example" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/lotusjay/github-action-example.git
//    git push -u origin main

    public static void main(String[] args) {
        SpringApplication.run(UnitTesting2Application.class, args);
    }

    // This is the method we want to test
    public int add(int a, int b) {
        return a + b;
    }
}

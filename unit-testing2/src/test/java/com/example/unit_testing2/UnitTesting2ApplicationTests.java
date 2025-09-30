package com.example.unit_testing2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UnitTesting2ApplicationTests {

    @Test
    void contextLoads() {
        // smoke test
    }

    @Test
    void testAdd() {
        UnitTesting2Application app = new UnitTesting2Application(); // create object of main class
        int result = app.add(2, 3); // call add method
        assertEquals(6, result); // check result
    }
}

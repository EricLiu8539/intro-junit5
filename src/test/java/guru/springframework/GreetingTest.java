package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {
    private Greeting greeting;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before All - only called once...");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In Before Each...");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
        System.out.println(greeting.helloWorld("Zhao"));
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("Eric"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In After Each...");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After All - only called once...");
    }
}

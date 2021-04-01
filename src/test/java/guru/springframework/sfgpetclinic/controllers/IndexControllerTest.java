package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {

    private IndexController indexController;

    @BeforeEach
    void setUp(){
        indexController = new IndexController();
    }

    @DisplayName("Test correct view name is returned for index page")
    @Test
    void index() {

        assertEquals("index",indexController.index(),"Wrong view returned");
    }

    @DisplayName("Test exception handler for handling incorrect view")
    @Test
    void oopsHandler() {
        //assertEquals("notimplemented",indexController.oupsHandler(),"Wrong view returned");
        //assertTrue("notimplemented".equalsIgnoreCase(indexController.oopsHandler()),() -> "Wrong view returned");

        assertThrows(ValueNotFoundException.class,() -> {
            indexController.oopsHandler();
        });
    }

    @Disabled
    @Test
    void testTimeout(){
        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(500);

            System.out.println("I got here");
        });
    }

    @Disabled
    @Test
    void testTimeOutPrempt() {

        assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
            Thread.sleep(500);

            System.out.println("I got here 2342342342342");
        });
    }
}
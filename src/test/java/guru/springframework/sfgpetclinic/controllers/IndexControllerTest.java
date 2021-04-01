package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {

    private IndexController indexController;

    @BeforeEach
    void setUp(){
        indexController = new IndexController();
    }

    @Test
    void index() {

        assertEquals("index",indexController.index(),"Wrong view returned");
    }

    @Test
    void oupsHandler() {
        //assertEquals("notimplemented",indexController.oupsHandler(),"Wrong view returned");
        assertTrue("notimplemented".equalsIgnoreCase(indexController.oupsHandler()),() -> "Wrong view returned");
    }
}
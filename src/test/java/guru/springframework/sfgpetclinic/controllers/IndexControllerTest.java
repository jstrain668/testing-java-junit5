package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.ControllerTests;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class IndexControllerTest implements ControllerTests {

    private IndexController indexController;

    @BeforeEach
    void setUp(){
        indexController = new IndexController();
    }

    @DisplayName("Test correct view name is returned for index page")
    @Test
    void index() {

        assertEquals("index",indexController.index(),"Wrong view returned");
        assertEquals("index",indexController.index(),() -> "Incorrect view returned");

        //AssertJ assertion
        assertThat(indexController.index()).isEqualTo("index");
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

    @Disabled("Demo of test timeout")
    @Test
    void testTimeout(){
        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(500);

            System.out.println("I got here");
        });
    }

    @Disabled("Demo of test timeout, running in a different thread")
    @Test
    void testTimeOutPrempt() {

        assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
            Thread.sleep(500);

            System.out.println("I got here 2342342342342");
        });
    }

    @Test
    void testAssumptionTrue(){
        assumeTrue("GURU".equalsIgnoreCase(System.getenv("GURU_RUNTIME")));
    }

    @Test
    void testAssumptionIsTrue(){
        assumeTrue("GURU".equalsIgnoreCase("GURU"));
    }

    @EnabledOnOs(OS.MAC)
    @Test
    void testMeOnMacOS() {
    }

    @EnabledOnOs(OS.WINDOWS)
    @Test
    void testMeOnWindows() {
    }

    @EnabledOnJre(JRE.JAVA_8)
    @Test
    void testMeOnJava8() {
    }

    @EnabledOnJre(JRE.JAVA_11)
    @Test
    void testMeOnJava11() {
    }

    @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "Developer")
    @Test
    void testIfUserDeveloper() {
    }

    @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "fred")
    @Test
    void testIfUserFred() {
    }
}
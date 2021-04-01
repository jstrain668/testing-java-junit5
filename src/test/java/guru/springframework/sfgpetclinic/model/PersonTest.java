package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest implements ModelTests {

    private Person person;

    @BeforeEach
    void setUp(){
        person = new Person(10l, "Joe", "Black");
    }

    @Test
    void groupedAssertions(){
        //given - see setUp()

        //then
        assertAll("Test Person properties",
                () -> assertEquals("Joe",person.getFirstName()),
                () -> assertEquals("Black", person.getLastName()));

    }

    @Test
    void groupedAssertionMsgs(){
        //given - see setUp()

        //then
        assertAll("Test Person properties",
                () -> assertEquals("Joe", person.getFirstName(), "First name failed"),
                () -> assertEquals("Black", person.getLastName(), "Last name failed"));

    }

}
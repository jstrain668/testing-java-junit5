package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void groupedAssertions(){
        //given

        Person person = new Person(10l, "Joe", "Black");
        //then
        assertAll("Test Person properties",
                () -> assertEquals(person.getFirstName(),"Joe"),
                () -> assertEquals(person.getLastName(), "Black"));

    }

    @Test
    void groupedAssertionMsgs(){
        //given

        Person person = new Person(10l, "Joe", "Black");
        //then
        assertAll("Test Person properties",
                () -> assertEquals(person.getFirstName(),"Joe", "First name failed"),
                () -> assertEquals(person.getLastName(), "Black", "Last name failed"));

    }

}
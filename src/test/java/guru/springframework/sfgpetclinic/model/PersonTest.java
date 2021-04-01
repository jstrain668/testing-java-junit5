package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.*;

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
        //Person person = new Person(10l, "Joe", "Black");

        //then
        assertAll("Test Person properties",
                () -> assertEquals("Joe",person.getFirstName()),
                () -> assertEquals("Black", person.getLastName()));

    }

    @Test
    void groupedAssertionMsgs(){
        //given - see setUp()
        //Person person = new Person(10l, "Joe", "Black");

        //then
        assertAll("Test Person properties",
                () -> assertEquals("Joe", person.getFirstName(), "First name failed"),
                () -> assertEquals("Black", person.getLastName(), "Last name failed"));

    }

    @RepeatedTest(value = 10, name = "{displayName} : {currentRepetition} - {totalRepetitions}")
    @DisplayName("My Repeated Test")
    void myRepeatedTest() {
        //todo - impl
    }

    @RepeatedTest(5)
    void myRepeatedTestWithDI(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getDisplayName() + ": " + repetitionInfo.getCurrentRepetition());

    }
}
package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class OwnerTest {

    private Owner owner;

    @BeforeEach
    void setUp(){
        owner = new Owner(3l,"Joe","Black");
    }

    @Test
    void dependentAssertions(){
        owner.setTelephone("0862227422");
        owner.setCity("Dublin");

        assertAll("Properties Test",
                () -> assertAll("Person Properties",
                        () -> assertEquals("Joe", owner.getFirstName(), "First name Did not Match"),
                        () -> assertEquals("Black", owner.getLastName(), "Last name did not match")),
                () -> assertAll("Owner Properties",
                        () -> assertEquals("Dublin", owner.getCity(), "City did not match"),
                        () -> assertEquals("0862227422", owner.getTelephone(), "Telephone number did not match")
                ));

        assertThat(owner.getCity(), is("Dublin"));
    }

}
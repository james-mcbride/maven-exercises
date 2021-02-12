import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class Main {


//    Create a test method that uses assertEquals or assertNotEquals to verify if the String Codeup is the same as CodeUp.
//Create a test method that uses assertNotSame to verify that the following ArrayLists are not the same:
//List<String> languages = new ArrayList<>();
//List<String> moreLanguages = new ArrayList<>();

@Test

public void testIfCompanyNameIsEquals() {
    String expected = "Codeup";
    String actual = "Codeup";

    assertEquals(expected, actual);
}
@Test
public void testIfArraysAreNotEqual(){
    ArrayList<String> languages = new ArrayList<>();
    ArrayList<String> moreLanguages = new ArrayList<>();
    assertNotSame(languages, moreLanguages);
}


//Create a test method that uses assertArrayEquals to verify the following arrays are equal.
//
//int[] numbers = {1, 2, 3};
//int[] otherNumbers = new int[3];
//otherNumbers[0] = 1;
//otherNumbers[1] = 2;
//otherNumbers[2] = 3;

    @Test
    public void testIfArraysAreEqual(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;
        assertArrayEquals(numbers, otherNumbers);
    }

//Create a test method that uses both assertFalse and assertTrue to verify the following statements:
//
//String language = "PHP";
//language.contains("H"); // use assertTrue for this statement
//language.contains("J"); // use assertFalse for this statement
    @Test
    public void testIfLetterIsPresent(){
        String language = "PHP";
        assertTrue(language.contains("H"));
        assertFalse(language.contains("P"));
    }
}

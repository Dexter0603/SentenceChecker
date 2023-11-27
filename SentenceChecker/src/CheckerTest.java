import org.junit.Test;

import static org.junit.Assert.*;

public class CheckerTest {
    @Test
    public void valid1() {
        assertTrue(Main.checker("The quick brown fox said \"hello Mr lazy dog\"."));
    }

    @Test
    public void valid2() {
        assertTrue(Main.checker("The quick brown fox said hello Mr lazy dog."));
    }

    @Test
    public void valid3() {
        assertTrue(Main.checker("One lazy dog is too few, 13 is too many."));
    }

    @Test
    public void valid4() {
        assertTrue(Main.checker("One lazy dog is too few, thirteen is too many."));
    }

    @Test
    public void valid5() {
        assertTrue(Main.checker("How many \"lazy dogs\" are there?"));
    }

    @Test
    public void invalid1() {
        assertFalse(Main.checker("The quick brown fox said \"hello Mr. lazy dog\"."));
    }

    @Test
    public void invalid2() {
        assertFalse(Main.checker("the quick brown fox said “hello Mr lazy dog\"."));
    }

    @Test
    public void invalid3() {
        assertFalse(Main.checker("\"The quick brown fox said “hello Mr lazy dog.\""));
    }

    @Test
    public void invalid4() {
        assertFalse(Main.checker("One lazy dog is too few, 12 is too many."));
    }

    @Test
    public void invalid5() {
        assertFalse(Main.checker("Are there 11, 12, or 13 lazy dogs?"));
    }

    @Test
    public void invalid6() {
        assertFalse(Main.checker("There is no punctuation in this sentence"));
    }
}

package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;
import  main.BalancedBrackets.*;
public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void detectsLeftBracket(){
        String lefty = "[lol";
        assertEquals(false, BalancedBrackets.hasBalancedBrackets(lefty));

    }

    @Test
    public void detectRightBracket(){
        String lefty = "lol[";
        assertEquals(false, BalancedBrackets.hasBalancedBrackets(lefty));

    }


    @Test
    public void detectUnBalancedBracket(){
        String orderedWrong = "]lol[";
        assertEquals(false, BalancedBrackets.hasBalancedBrackets(orderedWrong));

    }

    @Test
    public void detectBalancedBracket(){
        String orderedWrong = "[lol]";
        assertEquals(true, BalancedBrackets.hasBalancedBrackets(orderedWrong));

    }

    @Test
    public void detectDoubleBalancedBracket(){
        String orderedWrong = "[lol][lol]";
        assertEquals(true, BalancedBrackets.hasBalancedBrackets(orderedWrong));

    }
    @Test
    public void detectDoubleUnBalancedBracket(){
        String orderedWrong = "]lol[]lol[";
        assertEquals(false, BalancedBrackets.hasBalancedBrackets(orderedWrong));

    }


}


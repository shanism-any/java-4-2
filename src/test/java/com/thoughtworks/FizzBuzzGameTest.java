package com.thoughtworks;

import org.junit.Test;
import org.junit.Assert;

public class FizzBuzzGameTest {
    @Test
    public void should_return_Fizz_when_have_3() {
        FizzBuzzGame game = new FizzBuzzGame();
        game.start(100);
        Assert.assertEquals(game.getResult(13), "Fizz");
        Assert.assertEquals(game.getResult(30), "Fizz");
        Assert.assertEquals(game.getResult(66), "Fizz");
    }
        @Test
                public void contains(){
            FizzBuzzGame game = new FizzBuzzGame();
            Assert.assertEquals(game.Contains(11,1),true);
            Assert.assertEquals(game.Contains(23,1),false);
            Assert.assertEquals(game.Contains(100,0),true);
            Assert.assertEquals(game.Contains(78,7),true);
        }


}

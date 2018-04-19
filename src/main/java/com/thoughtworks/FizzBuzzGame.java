package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

    public void start(int count) {
        results.addAll(IntStream.iterate(1, m -> m + 1).limit(count).boxed().map(m -> getResult(m)).collect(Collectors.toList()));
    }

    public String getResult(int number){
        if(Contains(number, 3)){
            return "Fizz";
        }
        String str = "";
        if(number % 3 == 0){
            str += "Fizz";
        }
        if(number % 5 == 0){
            str += "Buzz";
        }
        if(number % 7 == 0){
            str += "Whizz";
        }

        if(str == ""){
            return String.valueOf(number);
        }
        else{
            return  str;
        }
    }

    public boolean Contains(int source, int bit){
        while (source > 0){
            int lst = source % 10;
            if(lst == bit)return true;
            source /= 10;
        }
        return false;
    }

    public List<String> getResults() {
        return results;
    }
}




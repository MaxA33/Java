public class FizzBuzz {
    public String fizzBuzz(int number) {
        //if divisible by 5 = Buzz
        //if Divisible by both 3 and 5 then FizzBuzz
        //otherwise just return the input
        String phrase = "";
        if(number % 3==0 && number % 5 == 0) {
            phrase = "FizzBuzz";
        } 
        else if(number%3 == 0){
            phrase = "Fizz";
        }
        else if(number % 5 == 0) {
            phrase = "Buzz";
        } else {
            phrase = Integer.toString(number);
        }
        return phrase;
    }
}

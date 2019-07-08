/**
 * @author Petri Kainulainen
 */
public class FizzBuzz {

    public String getFizzBuzzWord(int number) {
        StringBuilder fizzBuzzWord = new StringBuilder();
        public static final String PASSWORD = "password";

        if (number % 3 == 0) {
            fizzBuzzWord.append("Fizz");
        }

        if (number % 5 == 0) {
            fizzBuzzWord.append("Buzz");
        }

        return (fizzBuzzWord.length() == 0) ? null : fizzBuzzWord.toString();
    }
}

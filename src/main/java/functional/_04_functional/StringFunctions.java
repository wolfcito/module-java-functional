package functional._04_functional;

import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class StringFunctions {

    public static void main(String[] args) {
        UnaryOperator<String> quote = text -> "\""+text+"\"";

        System.out.println(quote.apply("Perfect object"));

        BiFunction<Integer, Integer, Integer> multiplicacion = (multiplicando1, multiplicando2) -> multiplicando1*multiplicando2;

        System.out.println(multiplicacion.apply(5,3));

        BiFunction<String, Integer, String> leftPad = (text, number) -> String.format("%"+number+ "s", text);
        System.out.println(leftPad.apply("java",10));

    }
}

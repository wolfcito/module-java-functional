package functional._05_sam;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public class AgeUtils {

    public static void main(String[] args) {

        Function<Integer, String> addZeros = value -> value < 10?"0"+value: String.valueOf(value);

        TriFunction<Integer, Integer, Integer, LocalDate> parseDate =
                (day, month, year) -> LocalDate.parse(year+"-"+addZeros.apply(month)+"-"+addZeros.apply(day));

        TriFunction<Integer, Integer, Integer, Integer> calculateYears = (day, moth, year) -> Period.between(
                parseDate.apply(day, moth, year),LocalDate.now()).getYears();

        TriFunction<Integer, Integer, Integer, Integer> calculateMonths = (day, moth, year) -> Period.between(
                parseDate.apply(day, moth, year),LocalDate.now()).getMonths();

        TriFunction<Integer, Integer, Integer, Integer> calculateDays = (day, moth, year) -> Period.between(
                parseDate.apply(day, moth, year),LocalDate.now()).getDays();



        System.out.println(calculateYears.apply(13,6,1987));
        System.out.println(calculateMonths.apply(13,6,1987));
        System.out.println(calculateDays.apply(13,6,1987));
    }

    @FunctionalInterface
    interface TriFunction<T,U,V,R>{
        R apply(T t, U u, V v);
    }
}

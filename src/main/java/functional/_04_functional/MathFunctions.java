package functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {
    public static void main(String[] args) {
        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer value) {
                return value*value;
            }
        };
        System.out.println(square.apply(5));

        Function<Integer, Boolean> isOdd = value -> (value%2) ==1;

        Predicate<Integer> isEven = value -> value%2 == 0;

        System.out.println(isEven.test(4));

        Predicate<Student> isApproved = student -> student.getCalification() >= 6.0;

        Student kaos = new Student(5.9);

        System.out.println(isApproved.test(kaos));
    }

    static class Student{
        private final double calification;

        public Student(double calification){
            this.calification = calification;
        }

        public double getCalification() {
            return calification;
        }
    }
}

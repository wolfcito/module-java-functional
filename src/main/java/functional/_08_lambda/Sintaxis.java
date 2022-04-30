package functional._08_lambda;


import functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Sintaxis {

    public static void main(String[] args) {
        List<String> cursos = NombresUtils.getList("Java", "Scala");

        cursos.forEach(curso-> System.out.println(curso));
        useZero(()->2);
        usePredicate(text -> text.isEmpty());
        useBifunction((x,y)-> x*y);
        useBifunction((x,y)->{
            System.out.println(x+ " - "+y);
            return x-y;
        });

        useNothing(()->{});
    }

    static  void useZero(ZeroArguments zeroArguments){    }

    static void usePredicate(Predicate<String> predicate){    }

    static void useBifunction(BiFunction<Integer, Integer, Integer> operacion){    }

    static void useNothing(OperadorNada nothing){}

    @FunctionalInterface
    interface ZeroArguments{
        int get();
    }
    @FunctionalInterface
    interface OperadorNada{
        void nada();
    }
}

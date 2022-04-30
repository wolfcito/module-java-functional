package functional._04_functional;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CLIArgumentsUtils {

    static void showHelp(CLIArguments cliArguments){
        Consumer<CLIArguments> consumer = cliArguments1 -> {
            if(cliArguments1.isHelp()){
                System.out.println("Manual solicitado");
            }
        };

        consumer.accept(cliArguments);
    }

    static CLIArguments generateCLI(){
        Supplier<CLIArguments> generator = () -> new  CLIArguments();

        return generator.get();
    }
}

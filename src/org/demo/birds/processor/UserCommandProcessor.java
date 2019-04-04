package org.demo.birds.processor;
import org.demo.birds.entities.Bird;

import java.util.Scanner;

/**
 * Реализовать интерфейсы IBirdCreator, IUserCommandProcessor, IInfiniteLoopProcessor
 */
public class UserCommandProcessor implements IBirdCreator, IInfiniteLoopProcessor  {
    @Override
    public Bird createBird(Scanner userInputReader) {
        Scanner consoleInputReader = new Scanner(System.in);
        System.out.println("Please, enter bird name:   ");
        String name = consoleInputReader.nextLine();
        System.out.println("Please, enter bird living area:  ");
        String living_area = consoleInputReader.nextLine();
        System.out.println("Please, enter bird size:  ");
        Double size = consoleInputReader.nextDouble();
        return new Bird(name, living_area, size);
    }

    @Override
    public void processInLoop() {
        Scanner consoleInputReader = new Scanner(System.in);

        System.out.println("Please, enter command:\n" +
                "     *      a - add new Bird\n" +
                "     *      s - search bird by name\n" +
                "     *      l - search bird by living area\n" +
                "     *      exit - terminate application    ");
        String value = consoleInputReader.nextLine();




    }
}

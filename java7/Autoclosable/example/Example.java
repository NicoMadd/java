package java7.Autoclosable.example;

import java7.Autoclosable.Handler;

public class Example {
    public static void main(String[] args) {
        /*
         * One solution could be making a try catch. Which is a logical thing to do.
         * Try different queries and see what happens. You'll see that after execution
         * the finally still is executed.
         */
        Handler handler = new Handler();
        try {

            handler.openConnection();
            handler.makeQuery("b");
        } catch (Exception ex) {
            System.out.println("Something went wrong");
        } finally {
            handler.closeConnection();
        }

        /*
         * See the difference here. Java 7 already provides a cleaner solution
         * implementing try-with-resources and an AutoClosable interface. All resources
         * such as autoHandler, will execute it's close method after the try block has
         * been executed.
         * 
         *
         * 
         */

        try (AutoClosableHandler autoHandler = new AutoClosableHandler()) {
            autoHandler.openConnection();
            autoHandler.makeQuery("b");
        } catch (Exception ex) {
            System.out.println("Something went wrong");
        }

        /*
         * Whats useful about this:
         * - Resources in try will execute it's close method after the try.
         * - Cleaner code.
         * 
         * Disadvantages:
         * - It can only be used with in-declared resources and it cant be accessed
         * afterwards.
         */

    }
}

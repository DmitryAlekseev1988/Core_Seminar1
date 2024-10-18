package ru.gb.safronov;

/**
 *
 */
public class Decorator {
    /**

     *
     * @param a 123
     * @return 456
     */
    public static String decorate(int a) {
        /*
666
         * */
        return String.format("Here is your number: %d.", a);
    }
}

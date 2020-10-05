package cse360assignment02;

/**
 * The AddingMachine program implements an application that
 * can add and subtract numbers and keeps a history of all the
 * operations. This history can be cleared with the clear() function.
 * It contains a main() method which can be used to test functionality.
 *
 * @author  Kinshuk Agrawal
 * @version 2.0
 * @since   2020-10-04
 */
public class AddingMachine {
    private int total;          // global variable for storing the current total
    private String history;     // String that stores the history of the operations

    public AddingMachine () {
        total = 0;
        history = "";
    }

    public int getTotal () {
        return total;
    }

    public void add (int value) {
        // if history string is empty, set it to ""
        if(history.length() == 0)
            history = "0";
        history = history + " + " + value;

        total = total + value;      // updating the total value
    }

    public void subtract (int value) {
        // if history string is empty, set it to ""
        if(history.length() == 0)
            history = "0";
        history = history + " - " + value;

        total = total - value;      // updating the total value
    }

    public String toString () {
        // returning the history string trimmed to remove excess spaces
        return history.trim();
    }

    public void clear() {
        // clearing history by setting history string to ""
        history = "";
    }

    // main function to check program functionality
    public static void main(String[] args)
    {
        AddingMachine myCalculator = new AddingMachine();
        myCalculator.add (4);
        myCalculator.subtract (2);
        myCalculator.add(5);
        System.out.println(myCalculator.toString());
        myCalculator.clear();
        System.out.println(myCalculator.toString());
    }
}

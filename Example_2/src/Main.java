import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        LinkedList <Integer> list = new LinkedList <> ();
        // saying 'want to construct LinkedList with Integer/s
        // list - name of variable
        // construct a new list
        // need to put <> just to indicate that there is something but not put Integer again
        System.out.println("Please give me some ints: "); // message to the user
        try (Scanner scanner = new Scanner (System.in))
        {
            while (scanner.hasNextInt ()) // while (int is available) / ask if there are still integers available
            {
                int val = scanner.nextInt (); // list.add (scanner....) read int and add to the end of the list
                int addIndex;
                for (addIndex = 0; addIndex < list.size() && val < list.get (addIndex); addIndex ++)
                    // when value/input is smaller than element
                    ;
                list.add (addIndex, val);
                for (int v : list)  // inside while loop so that it sorts each single number in the
                                    // correct order over and over again util a non int number
                {
                    System.out.print(v + " ");
                }
                System.out.println();
            }
        }
        catch (Exception e) // error handling
        {
            System.out.println("got error: " + e);
            System.exit (1);
        } // exiting the loop and catch
    }
}
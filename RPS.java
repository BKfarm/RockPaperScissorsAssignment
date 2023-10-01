import java.util.*;

public class RPS
{
    public static void main(String[] args)
    {
        boolean done = false;
        boolean finished = false;
        String playA = "";
        String playB = "";
        Scanner in = new Scanner(System.in);
        do
        {
            do
            {
                System.out.println("Enter RPS move for player A: [RPS]: ");
                    playA = in.nextLine();
                    if (playA.equals("R") || playA.equals("P") || playA.equals("S"))
                    {
                        done = true;
                    }
                in.nextLine();
            }while(!done);
            done = false;
            do
            {
                System.out.println("Enter RPS move for player B: [RPS]: ");
                playB = in.nextLine();
                if (playB.equals("R") || playB.equals("P") || playB.equals("S"))
                {
                    done = true;
                }
                in.nextLine();
            }while(!done);
            switch (playA)
            {
                case "R":

                case "P":

                case "S":

            }

        }while(!finished);
    } 
}
import java.util.*;

public class RPS
{
    public static void main(String[] args)
    {
        boolean done = false;
        boolean finished = false;
        String playA = "";
        String playB = "";
        String gameEnder = "";
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
                    switch (playB)
                    {
                        case "R":
                            System.out.println("Rock vs. rock- It's a tie!");
                            break;
                        case "P":
                            System.out.println("Paper covers rock- Player B wins!");
                            break;
                        case "S":
                            System.out.println("Rock smashes scissors- Player A wins!");
                    }
                    break;
                case "P":
                    switch (playB)
                    {
                        case "R":
                            System.out.println("Paper covers rock- Player A wins!");
                            break;
                        case "P":
                            System.out.println("Paper vs. paper- It's a tie!");
                            break;
                        case "S":
                            System.out.println("Scissors cuts paper- Player B wins!");
                    }
                    break;
                case "S":
                    switch (playB)
                    {
                        case "R":
                            System.out.println("Rock smashes scissors- Player B wins!");
                            break;
                        case "P":
                            System.out.println("Scissors cuts paper- Player A wins!");
                            break;
                        case "S":
                            System.out.println("Scissors vs. scissors- It's a tie!");
                    }
            }
            System.out.println("Would you like to continue? [Y/N]");
            gameEnder = in.nextLine();
            if (gameEnder.equalsIgnoreCase("N"))
            {
                finished = true;
            }
        }while(!finished);
    } 
}
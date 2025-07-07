import java.util.*;
class manas {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        double r = Math.round(Math.random()*10);
        if(r>=6.0)
        {
            r -=5;
        }
        System.out.println("Enter your response ");
        String resp=sc.next().toUpperCase();

        String com="";
        switch ((int) r) {
            case (int) 1.0 -> com = "ROCK";
            case (int) 2.0 -> com = "PAPER";
            case (int) 3.0 -> com = "SCISSOR";
            case (int) 4.0 -> com = "ROCK";
            case (int) 5.0 -> com = "PAPER";
            case (int) 6.0 -> com = "SCISSOR";
        }

        System.out.println("JAVA CHOSE " + com);

        if (resp.equals("ROCK") && com.equals("ROCK"))
        {
            System.out.println("DRAW !");
        }
        else if (resp.equals("ROCK") && com.equals("PAPER"))
        {
            System.out.println("JAVA WINS !");
        }
        else if (resp.equals("ROCK") && com.equals("SCISSOR"))
        {
            System.out.println("USER WINS !");
        }
        else if (resp.equals("SCISSOR") && com.equals("PAPER"))
        {
            System.out.println("USER WINS !");
        }
        else if (resp.equals("SCISSOR") && com.equals("ROCK"))
        {
            System.out.println("JAVA WINS !");
        }
        else if (resp.equals("SCISSOR") && com.equals("SCISSOR"))
        {
            System.out.println("DRAW !");
        }
        else if (resp.equals("PAPER") && com.equals("PAPER"))
        {
            System.out.println("DRAW !");
        }
        else if (resp.equals("PAPER") && com.equals("ROCK"))
        {
            System.out.println("USER WINS !");
        }
        else if (resp.equals("PAPER") && com.equals("SCISSOR"))
        {
            System.out.println("JAVA WINS !");
        }
    }
}

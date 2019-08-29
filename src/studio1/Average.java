package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main (String[] args){
        ArgsProcessor ap = new ArgsProcessor(args);
        int x = ap.nextInt("First integer");
        int y = ap.nextInt("Second integer");
        System.out.println("Average of " + x + " and " + y + " is " + (double)(x+y)/2);

    }
}

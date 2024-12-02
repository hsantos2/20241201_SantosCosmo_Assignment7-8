
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Main method

        //Create an array with a length of 10
        Scanner input= new Scanner(System.in);
        double[] values= new double[10];

        //Prompt the user to enter  10 values
        System.out.print("Enter ten double values: ");
        for (int i=0; i<values.length; i++){
            values[i]=input.nextDouble();
        }

        //Display average
        System.out.println("The average value: " +average(values));

    }

    //Overload method returns average of integer array
    public static int average(int[] array){
        int average= 0;
        for (int i: array)
        average += i;
            return average/array.length;
    }
    //Overload method returns average of double array
    public static double average(double[] array){
        double average= 0;
        for(double i:array)
        average+=i;
            return average/array.length;
    
    }
}

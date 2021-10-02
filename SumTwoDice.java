package BrpAssignment;
import java.util.Random;
public class SumTwoDice {
	public static void main ( String[] args )
    {
        Random r1 = new Random();
        int num1=r1.nextInt(6)+1;
        int num2=r1.nextInt(6)+1;
        int num3=num1+num2;
        System.out.println("Output::"+num3);
    }
}


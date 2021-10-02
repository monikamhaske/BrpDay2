package BrpAssignment;
import java.util.Scanner;
public class IntegerOeration {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Three Integer Value x,y,z :");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        int operation1 = x + y * z;
        System.out.println("Out1::" + operation1);
        int operation2 = x * y + z;
        System.out.println("Out2::" + operation2);
        int operation3 = x + y / z;
        System.out.println("Out3::" + operation3);
        int operation4 = x % y + z;
        System.out.println("Out4::" + operation4);
    }
}


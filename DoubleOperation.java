package BrpAssignment;
import java.util.Scanner;
public class DoubleOperation {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Three Integer Value x,y,z:");
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z =scan.nextDouble();
        double operation1 = x + y * z;
        System.out.println("Out1::" + operation1);
        double operation2 = x * y + z;
        System.out.println("Out2::" + operation2);
        double operation3 = x + y / z;
        System.out.println("Out3::" + operation3);
        double operation4 = x % y + z;
        System.out.println("Out4::" + operation4);
    }
}

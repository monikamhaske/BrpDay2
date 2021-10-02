package BrpAssignment;

public class MethodError {
	public static void main(String[] args) {
        Produceerror p1 = new Produceerror();
        p1.add(10, 12);
        
    }
}
class Produceerror {
    int z=0;
    public void add(int x, int y) {
        z = x+y;
        show(z);
    }
    public void show(int z) {
        System.out.println("Output::"+z);
    }
}


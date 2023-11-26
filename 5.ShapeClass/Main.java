
public class Main {
    public static void main(String args[]) {
        Triangle t = new Triangle();
        Rectangle r = new Rectangle();
        System.out.println("Enter dimensions for Triangle:");
        t.input_data();
        System.out.print("Computed ");
        t.compute_area();
        System.out.println("Enter dimensions for Rectangle:");
        r.input_data();

        System.out.print("Computed ");
        r.compute_area();
    }
}

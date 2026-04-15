import java.util.ArrayList;
import java.util.List;

class UseCase2TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("======================================\n");

        // Create an ArrayList to hold passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // ---- CREATE (Add bogies) ----
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // ---- READ (Display bogies) ----
        System.out.println("Passenger bogies after addition:");
        System.out.println(passengerBogies);

        // ---- DELETE (Remove a bogie) ----
        passengerBogies.remove("AC Chair");
        System.out.println("\nAfter removing 'AC Chair':");
        System.out.println(passengerBogies);

        // ---- CHECK (Existence) ----
        boolean isSleeperPresent = passengerBogies.contains("Sleeper");
        System.out.println("\nIs 'Sleeper' present? " + isSleeperPresent);

        // ---- Final State ----
        System.out.println("\nFinal passenger bogie list:");
        System.out.println(passengerBogies);
    }
}
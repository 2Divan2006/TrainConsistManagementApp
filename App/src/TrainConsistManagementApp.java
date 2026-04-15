import java.util.ArrayList;
import java.util.List;

class UseCase1TrainConsistMgmt {

    public static void main(String[] args) {

        // Display Welcome Banner
        System.out.println("======================================");
        System.out.println("   Train Consist Management App");
        System.out.println("======================================\n");

        // Create a dynamic list to store train bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initialization message
        System.out.println("Train initialized successfully...");

        // Display initial bogie count
        System.out.println("Initial bogie count: " + trainConsist.size());

        // Display current state of train
        System.out.println("Current train consist: " + trainConsist);
    }
}
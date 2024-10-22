import java.util.ArrayList;
import java.util.List;

public class Trip {
    private String destination;
    private double distance;
    private double costPerKm;
    private List<Passenger> passengers;

    public Trip(String destination, double distance, double costPerKm){
        this.destination = destination;
        this.distance = distance;
        this.costPerKm = costPerKm;
        this.passengers = new ArrayList<>();
    }

    public double calculateTotalCost(){
        return distance * costPerKm;
    }

    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }

    public void printPassengerList(){
        System.out.println("Daftar Penumpang:");
        for (Passenger passenger : passengers) {
            System.out.println(passenger.getInfo());
        }
    }

    public boolean cancelTrip() {
        if (passengers.size() < 1) { // bisa diganti dengan jumlah minimum yang diinginkan
            System.out.println("Perjalanan dibatalkan.");
            return true;
        }
        return false;
    }
}

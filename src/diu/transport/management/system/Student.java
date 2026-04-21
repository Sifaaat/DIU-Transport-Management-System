package diu.transport.management.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Student extends User {

    public Student(String username, String password) {
        super(username, password);
    }

    public void viewBuses() {
        try {
            Connection con = DBConnection.getConnection();
            String query = "SELECT * FROM bus_info";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            boolean found = false;

            while (rs.next()) {
                found = true;
                System.out.println("\n---------------------------");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Bus Name: " + rs.getString("bus_name"));
                System.out.println("Bus Number: " + rs.getString("bus_number"));
                System.out.println("Driver Name: " + rs.getString("driver_name"));
                System.out.println("Driver Contact: " + rs.getString("driver_contact"));
                System.out.println("Departure Time: " + rs.getString("departure_time"));
                System.out.println("Route: " + rs.getString("route"));
            }

            if (!found) {
                System.out.println("No bus information found.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

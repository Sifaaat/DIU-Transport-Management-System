package diu.transport.management.system;

import java.sql.*;
import java.util.Scanner;

public class Admin extends User {

    public Admin(String username, String password) {
        super(username, password);
    }

    // Add Bus
    public void addBus(Scanner sc) {
        try {
            Connection con = DBConnection.getConnection();

            System.out.print("Bus Name: ");
            String name = sc.nextLine();

            System.out.print("Bus Number: ");
            String number = sc.nextLine();

            System.out.print("Driver Name: ");
            String driver = sc.nextLine();

            System.out.print("Driver Contact: ");
            String contact = sc.nextLine();

            System.out.print("Departure Time: ");
            String time = sc.nextLine();

            System.out.print("Route: ");
            String route = sc.nextLine();

            String sql = "INSERT INTO bus_info VALUES (NULL,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, name);
            pst.setString(2, number);
            pst.setString(3, driver);
            pst.setString(4, contact);
            pst.setString(5, time);
            pst.setString(6, route);

            pst.executeUpdate();
            System.out.println("Bus Added.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // View Bus
    public void viewBus() {
        try {
            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM bus_info";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                System.out.println("\nID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("bus_name"));
                System.out.println("Number: " + rs.getString("bus_number"));
                System.out.println("Driver: " + rs.getString("driver_name"));
                System.out.println("Contact: " + rs.getString("driver_contact"));
                System.out.println("Time: " + rs.getString("departure_time"));
                System.out.println("Route: " + rs.getString("route"));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Update Bus
    public void updateBus(Scanner sc) {
        try {
            Connection con = DBConnection.getConnection();

            System.out.print("Enter Bus ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("New Bus Name: ");
            String name = sc.nextLine();

            System.out.print("New Bus Number: ");
            String number = sc.nextLine();

            System.out.print("New Driver Name: ");
            String driver = sc.nextLine();

            System.out.print("New Driver Contact: ");
            String contact = sc.nextLine();

            System.out.print("New Time: ");
            String time = sc.nextLine();

            System.out.print("New Route: ");
            String route = sc.nextLine();

            String sql = "UPDATE bus_info SET bus_name=?, bus_number=?, driver_name=?, driver_contact=?, departure_time=?, route=? WHERE id=?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, name);
            pst.setString(2, number);
            pst.setString(3, driver);
            pst.setString(4, contact);
            pst.setString(5, time);
            pst.setString(6, route);
            pst.setInt(7, id);

            pst.executeUpdate();
            System.out.println("Updated.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Delete Bus
    public void deleteBus(Scanner sc) {
        try {
            Connection con = DBConnection.getConnection();

            System.out.print("Enter Bus ID: ");
            int id = Integer.parseInt(sc.nextLine());

            String sql = "DELETE FROM bus_info WHERE id=?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, id);
            pst.executeUpdate();

            System.out.println("Deleted.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
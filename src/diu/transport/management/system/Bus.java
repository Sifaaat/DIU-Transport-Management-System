
package diu.transport.management.system;

public class Bus {
    private String busName;
    private String busNumber;
    private String driverName;
    private String driverContact;
    private String departureTime;
    private String route;

    public Bus(String busName, String busNumber, String driverName, String driverContact, String departureTime, String route) {
        this.busName = busName;
        this.busNumber = busNumber;
        this.driverName = driverName;
        this.driverContact = driverContact;
        this.departureTime = departureTime;
        this.route = route;
    }

    public String getBusName() {
        return busName;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getDriverContact() {
        return driverContact;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getRoute() {
        return route;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setDriverContact(String driverContact) {
        this.driverContact = driverContact;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public void showBusInfo() {
        System.out.println("Bus Name        : " + busName);
        System.out.println("Bus Number      : " + busNumber);
        System.out.println("Driver Name     : " + driverName);
        System.out.println("Driver Contact  : " + driverContact);
        System.out.println("Departure Time  : " + departureTime);
        System.out.println("Route           : " + route);
    }
}
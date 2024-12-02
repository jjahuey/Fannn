public class Main {

    // Constants for speed
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private data fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-arg constructor (default fan)
    public Main() {
        this.speed = SLOW;  // Default speed is SLOW
        this.on = false;    // Default fan state is off
        this.radius = 5;    // Default radius
        this.color = "blue"; // Default color is blue
    }

    // Accessor methods (getters)
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // Mutator methods (setters)
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Method to return a string description of the fan
    public String toString() {
        if (on) {
            return "Fan speed: " + speed + ", color: " + color + ", radius: " + radius;
        } else {
            return "Fan color: " + color + ", radius: " + radius + " - fan is off";
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create the first fan object
        Main fan1 = new Main();
        fan1.setSpeed(FAST);  // Maximum speed
        fan1.setRadius(10);   // Radius 10
        fan1.setColor("yellow"); // Color yellow
        fan1.setOn(true);     // Turn it on

        // Create the second fan object
        Main fan2 = new Main();
        fan2.setSpeed(MEDIUM); // Medium speed
        fan2.setRadius(5);     // Radius 5
        fan2.setColor("blue"); // Color blue
        fan2.setOn(false);     // Turn it off

        // Display the objects using toString method
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}

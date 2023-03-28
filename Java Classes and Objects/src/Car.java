public class Car {
//     Minimum 3 private instance variables 
private int wheels;
private String type;
private String color;
// An empty constructor 
public Car(){};
// A constructor that uses only 2 of your 3 variables
public Car(int wheels, String color){
        this.wheels = wheels;
        this.color = color;
}
// A constructor that uses all 3 of your instance variables 
public Car(int wheels, String color, String type){
    this.wheels = wheels;
    this.color = color;
    this.type = type;
}
// Get methods for all 3 of your instance variables and Set methods for all 3 of your instance variables 
 /**
     * @return int returns wheels
     */
    public int getWheels() {
        return wheels;
    }

     //@return String return the type
     
     public String getType() {
        return type;
    } 

    
     // @return String return the type
     
    public String getColor() {
        return color;
    }

// A method that returns a Boolean 
public boolean isHumming() {
    return true; 
}
// A method that returns a String (For example, if I created a Santa Custom Class, my code would look something like the attached Santa.java file. 
public String ShinyCar() {
    return "Wow! That's a really nice looking car!";
}

}
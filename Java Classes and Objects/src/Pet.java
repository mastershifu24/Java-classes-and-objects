public class Pet {


//     name (PRIVATE) 
private String name;

// age (PRIVATE) 
private int age;
// location (PRIVATE)
private String location; 
// type (PRIVATE) 
private String type;
// two constructors(empty, all attributes)
public Pet(){};
public Pet(String name, int age, String location, String type){
    this.name = name;
    this.age = age;
    this.location = location;
    this.type = type;
}
// Code to be able to access the following (Get Methods): 
// name, age, type
 
// Code to be able to change (Set Methods): 
// name, age, location  
    

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }


    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return String return the type
     */
    public String getType() {
        return type;
    }

}
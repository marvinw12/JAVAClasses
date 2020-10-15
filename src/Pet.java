public class Pet {
    
    private String name;
    private int age;
    private String location;
    private String type;  
    
    public Pet(){
        
    }

    public Pet(String petName, int petAge, String petLocation, String petType){
        name = petName;
        age = petAge;
        location = petLocation;
        type = petType;

    }

    public void getName(){
        System.out.println("My pets name is " + name);
    }

    public void getAge(){
        System.out.println("My pet's age is " + age);
    }
    
    public void getType(){
        System.out.println("My pet is a " + type);
    }

    public void changeName(String newName){
        System.out.println("I changed my pet's name to " + newName);
        this.name = newName;
    }

    public void changeAge(int newAge){
        System.out.println("My pet's new age is now " + newAge);
        this.age = newAge;
    }

    public void changeLocation (String newLocation){
        System.out.println("My dog is from " + newLocation);
        this.location = newLocation;
    }




}

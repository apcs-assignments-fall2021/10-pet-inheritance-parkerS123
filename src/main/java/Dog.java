public class Dog extends Pet {
    // Instance variable(s)
    private String Breed;


    // Constructors
    public Dog(String name, int age, String Breed){
        super(name, age);
        this.Breed = Breed;
    }

    public Dog(){
        super("milan", 16);
        this.Breed = "Chihuahua";
    }

    // makeNoise() method
    public void makeNoise(){
        System.out.println("woof woof");
    }


    // toString method
    public String toString(){
        String s = "Dog information: " + getName() + " , Age: " + getAge() + " , Breed: " + this.Breed;
        return s;
    }


    // Getter
    public String getBreed(){
        return this.Breed;
    }


    // Setter
    public void setBread(String Breed){
        this.Breed = Breed;
    }
}
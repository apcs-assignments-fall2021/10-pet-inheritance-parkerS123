public class DogClient {
    public static void main(String[] args) {
        Dog goodboy = new Dog("Pippen", 2, "French Bulldog");

        System.out.println(goodboy.getBreed());
        goodboy.setAge(4);
        System.out.println(goodboy.getAge());
        goodboy.setBread("Pug");
        System.out.println(goodboy.getBreed());
        System.out.println(goodboy.toString());

        
    }
}
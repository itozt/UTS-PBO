public class Passenger {
    private String name;
    private int age;

    public Passenger(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getInfo(){
        return "Nama: " + name + ", Usia: " + age;
    }
}

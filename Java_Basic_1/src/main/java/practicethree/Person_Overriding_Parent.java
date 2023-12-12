package practicethree;

public class Person_Overriding_Parent {
    private String name;

    private String gender;

    private int age;

    public Person_Overriding_Parent(){  // Formula of constructor = access modifier then class's name
        System.out.println("Printer from person constructor");
    }

    public Person_Overriding_Parent(String name) { // Formula of constructor = access modifier then class's name
        this.name = name;
        System.out.println("Printer from person constructor" + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void greetings(){
        System.out.println("Hello " + name + "!");
    }
}

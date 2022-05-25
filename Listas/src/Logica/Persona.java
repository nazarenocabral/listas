
package Logica;


public class Persona {
    
    private int age;
    private String name;
    private int id;

    public Persona() {
    }

    public Persona(int age, String name, int id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Persona{" + "age=" + age + ", name=" + name + ", id=" + id + '}';
    }
    
    
    
}

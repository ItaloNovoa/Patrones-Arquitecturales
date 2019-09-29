package arem.lab5.demo;

public class Usuario{

    public String id;
    public String name;
    public String lastName;

    public Usuario(String id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    
    public Usuario() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Usuario(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    
}
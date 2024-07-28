package com.thenerd.SpringJDBCcon.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//here component is must bcz we need to manage this by spring framework
@Component
@Scope("prototype") //since we are working with multiple bikers
public class Bikers {

    private int Id;
    private String name;
    private int Tops;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTops() {
        return Tops;
    }

    public void setTops(int tops) {
        Tops = tops;
    }
    //have a toString to print the object

    @Override
    public String toString() {
        return "Bikers{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", Tops=" + Tops +
                '}';
    }
}

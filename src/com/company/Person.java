package com.company;

public class Person {
    private String name;
    private boolean frenchfries;
    private boolean sleeping;
    private boolean adventurous;

    public class person{
    }

    public Person(String name, boolean frenchfries, boolean sleeping, boolean adventurous) {
        this.name = name;
        this.frenchfries = frenchfries;
        this.sleeping = sleeping;
        this.adventurous = adventurous;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFrenchfries() {
        return frenchfries;
    }

    public void setFrenchfries(boolean frenchfries) {
        this.frenchfries = frenchfries;
    }

    public boolean isSleeping() {
        return sleeping;
    }

    public void setSleeping(boolean sleeping) {
        this.sleeping = sleeping;
    }

    public boolean isAdventurous() {
        return adventurous;
    }

    public void setAdventurous(boolean adventurous) {
        this.adventurous = adventurous;
    }

}


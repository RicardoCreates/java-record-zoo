package de.ricardo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating species and owners
        Species lionSpecies = new Species("Lion", 8000);
        Species apeSpecies = new Species("Ape", 6000);
        Owner owner1 = new Owner("John Doe", 45, "123 Jungle Street");
        Owner owner2 = new Owner("Charles Prinz", 55, "234 Zoo Street");

        // Creating Animal objects
        Animal animal1 = new Animal(1, "Simba", lionSpecies, 3, owner1);
        Animal animal2 = new Animal(2, "Nala", lionSpecies, 3, owner1);
        Animal animal3 = new Animal(3, "Bob", apeSpecies, 3, owner2);

        // Testing toString
        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);

        // Testing equals
        System.out.println(animal1.equals(animal2));

        // Zoo
        Zoo zoo = new Zoo(List.of(animal1, animal2, animal3));
        System.out.println("Total Food Requirement: " + zoo.totalFoodRequirement() + " grams per day");
    }
}

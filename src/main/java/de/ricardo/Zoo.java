package de.ricardo;

import java.util.List;

public record Zoo(List<Animal> animals) {
    public int totalFoodRequirement() {
        return animals.stream()
                .mapToInt(animal -> animal.species().foodRequirementInGramsPerDay())
                .sum();
    }
}

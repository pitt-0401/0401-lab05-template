/*
 * Created on 2026-09-24
 *
 * Copyright (c) 2026 Nadine von Frankenberg
 */

// LAB05 template - CMPINF 0401, Fall 2026
// Condensed from the LAB04 sample solution.

public class Cat {

    private String name;
    private int age;
    private String funnyStory;
    private int energyLevel;

    // TODO 2.2: A cat references its owner; none by default
    // TODO 2.3: A cat is adoptable by default, and no longer adoptable once adopted

    public Cat(String name, int age, String funnyStory, int energyLevel) {
        this.name = name;
        this.age = age;
        this.funnyStory = funnyStory;
        this.energyLevel = energyLevel;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getFunnyStory() {
        return this.funnyStory;
    }

    public int getEnergyLevel() {
        return this.energyLevel;
    }

    // TODO 2.4: Add encapsulation methods as needed

    public boolean wantsToPlay() {
        return this.energyLevel > 3;
    }

    public boolean play() {
        if (wantsToPlay()) {
            this.energyLevel = this.energyLevel - 2;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cat [name=" + this.name + ", age=" + this.age + ", funnyStory=" + this.funnyStory
                + ", energyLevel=" + this.energyLevel + "]";
    }
}

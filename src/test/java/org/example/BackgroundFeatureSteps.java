package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundFeatureSteps {

    @Given("cat is sad")
    public void catIsSad() {
        System.out.println("Meow :(");
    }

    @Given("cat is murmur")
    public void catIsMurMur() {
        System.out.println("Murmur");
    }

    @When("Pet the cat")
    public void petTheCat() {
        System.out.println("How is a good girl?");
    }

    @Then("Cat is happy")
    public void catIsHappy() {
        System.out.println("Mur meow!");
    }
}

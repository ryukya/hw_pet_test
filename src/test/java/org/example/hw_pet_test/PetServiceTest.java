package org.example.hw_pet_test;

import org.example.hw_pet_test.entities.Category;
import org.example.hw_pet_test.entities.Pet;
import org.example.hw_pet_test.entities.status;
import org.example.hw_pet_test.steps.PetServiceSteps;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;
import java.util.TreeMap;

public class PetServiceTest {

    @Test
    public void createUsersTest() {
        Pet expectedPet = createPet();
        Pet createdPet = PetServiceSteps.createUser(expectedPet);
        Assert.assertEquals(createdPet.getName(), expectedPet.getName(), "Expected pet doesn't have correct name");
    }
    @Test
    public void getPetByIdNegativeTest() {
        Pet pets = PetServiceSteps.getUsersById(111);
        Pet pet1 = PetServiceSteps.getUsersById(pets.getId());
        Assert.assertEquals(pet1.getName(), pets.getName(), "Pet with this ID should not exist");
    }
    @Test
    public void getUsersByIdTest() {
        Pet pets = PetServiceSteps.getUsersById( 1);
        Pet pet1 = PetServiceSteps.getUsersById(pets.getId());
        Assert.assertEquals(pet1.getName(), pets.getName(), "Expected user doesn't have correct name");
    }

    private Pet createPet() {
        Random random = new Random();
        Category category= new Category().setIdCat(random.nextInt(50))
                .setNameCat("Cats");
        return new Pet()
                .setId(random.nextInt(100))
                .setName("Kota" + random.nextInt(50) )
                .setCategory(category)
                .setStatus(status.available.toString());
    }
}

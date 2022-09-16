package org.example.hw_pet_test;

import org.example.hw_pet_test.entities.Category;
import org.example.hw_pet_test.entities.Pet;
import org.example.hw_pet_test.entities.Tag;
import org.example.hw_pet_test.enums.status;
import org.example.hw_pet_test.steps.PetServiceSteps;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PetServiceTest {

    @Test
    public void createPetTest() {
        Pet expectedPet = createPet(1, "pending");
        Pet createdPet = PetServiceSteps.createPet(expectedPet);
        Assert.assertEquals(createdPet.getName(), expectedPet.getName(), "Expected pet doesn't have correct name");
    }

    @Test
    public void getPetByIdTest() {
        Pet pets = PetServiceSteps.getPetsById(1);
        Pet pet1 = PetServiceSteps.getPetsById(pets.getId());
        Assert.assertEquals(pet1.getName(), pets.getName(), "Expected pet doesn't have correct name");
    }

    @Test
    public void getPetByStatusTest() {
        createPet(2, "available");
        List<Pet> petsList = PetServiceSteps.getPetsByStatus(status.available.toString());
        Assert.assertEquals(petsList.size(), 1, "Expected pet list size doesn't equal to actual");
    }


    private Pet createPet(int id, String statusenum) {
        Random random = new Random();
        Category category = new Category().setId(random.nextInt(50))
                .setName("Cats");
        Tag tag1 = new Tag().setId(1)
                .setName("Tag1");
        List<Tag> tagList = new ArrayList<>();
        tagList.add(tag1);
        return new Pet()
                .setId(id)
                .setName("Kota" + random.nextInt(50))
                .setCategory(category)
                .setStatuss(status.valueOf(statusenum))
                .setTags(tagList);
    }
}

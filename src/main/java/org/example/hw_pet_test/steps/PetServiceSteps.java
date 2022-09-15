package org.example.hw_pet_test.steps;

import org.example.hw_pet_test.entities.Pet;
import org.example.hw_pet_test.service.PetService;

import java.util.List;

import static org.example.hw_pet_test.service.uritemplate.PetServiceUri.PETS;
import static org.example.hw_pet_test.service.uritemplate.PetServiceUri.PET_BY_ID;

public class PetServiceSteps {
    private static final PetService PET_SERVICE = PetService.getInstance();

    public static Pet getUsersById(int id) {
        return PET_SERVICE.getRequest(PET_BY_ID, id).as(Pet.class);
    }

    public static Pet createUser(Pet pet1) {
        return PET_SERVICE.postRequest(PETS, pet1).as(Pet.class);
    }

    public static void deleteUserById(int id) {
        PET_SERVICE.deleteRequest(PET_BY_ID, id);
    }
}

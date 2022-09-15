package org.example.hw_pet_test.service.uritemplate;

public class PetServiceUri {
    public static final UriTemplate PETS = new UriTemplate("pet");
    public static final UriTemplate PET_BY_ID = new UriTemplate("pet/%s");
    public static final UriTemplate PET_BY_STATUS = new UriTemplate("pet/findByStatus?status=%s");
}

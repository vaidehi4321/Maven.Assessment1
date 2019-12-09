package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    String ownerName;
    Pet[] pets;
    ArrayList<Pet> petsList;


    public PetOwner(String name, Pet... pets) {

        this.ownerName = name;
        this.pets = pets;
        this.petsList = new ArrayList<>(Arrays.asList(pets));


    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        if(pet != null){
        ArrayList<Pet>listOfPets=new ArrayList<>();
        listOfPets.add(pet);
        Pet[] newPet = new Pet[listOfPets.size()];
        listOfPets.toArray(newPet);}

    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        if(petsList!=null) {
            petsList.remove(pet);
        }
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        if (petsList.contains(pet)) {
            return true;
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        int lowestAge = Integer.MAX_VALUE;
        for (int i = 0; i < petsList.size(); i++) {

            if (petsList.get(i).getAge() < lowestAge) {
                lowestAge = petsList.get(i).getAge();
            }
        }
        return lowestAge;
    }


    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int greatestAge=0;
        for(int i =0 ;i < petsList.size() ;i++){
            if(petsList.get(i).getAge()>greatestAge){
                greatestAge=petsList.get(i).getAge();
            }
        }
        return greatestAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Float sum = 0.0f;
        Float avg = 0.0f;
        for( int i = 0 ;i < petsList.size(); i++) {
            sum = sum + petsList.get(i).getAge();
        }
        avg = sum / petsList.size();

        return avg;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return petsList.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return ownerName;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return pets;
    }
}

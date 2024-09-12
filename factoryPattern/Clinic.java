package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void petDetails(PetRecord petFile){                   
        System.out.println("Pet id is " + petFile.getPetId());
        System.out.println("Pet name is " + petFile.getPetName());
        System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
        System.out.println("Communication sound: "+ petFile.getPet().makeSound());
        System.out.println("Play mode: " + petFile.getPet().play());
    }
    public static void newLine(){
        System.out.println();
    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        PetRecord petFile = new PetRecord();
        Pet pet;

        boolean on = true;

        do { 
            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.print("\nChoose your pet number: ");
            Integer choice = input.nextInt();

            switch(choice){
                case 1: pet = new Dog();
                    petFile.setPetId("D01");
                    petFile.setPetName("Bantay");
                    petFile.setPet(pet);

                    newLine();
                    ((Dog) pet).setBreed("German Shepperd");
                    System.out.println("Breed of Dog: " + ((Dog) pet).getBreed());
                    petDetails(petFile);
                    newLine();
                    
                    break;
                case 2: pet = new Cat();
                    petFile.setPetId("C01");
                    petFile.setPetName("Muning");
                    petFile.setPet(pet);
                    ((Cat) pet).setNoOfLives(9);

                    newLine();
                    System.out.println("Number of Lives of Cat: " + ((Cat) pet).getNoOfLives());
                    petDetails(petFile);
                    newLine();

                    break;
                case 3:
                    on = false;
            }
        } while (on);
    }
}

package de.quinscape;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.searchForClientAndPrintInformation();
    }
}

class Engine{
    static ArrayList<Person> listOfPerson = new ArrayList<>();

    public void searchForClientAndPrintInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter client-id: ");

        while (scanner.hasNextInt()){
            System.out.println("==========Enter client-id:");
            int id = scanner.nextInt();
            getInformationFromPerson(personList(),id);
        }
    }

    private void getInformationFromPerson(ArrayList<Person> personList, int id) {;
        id = id-1;

        int personId = personList.get(id).getId();
        String firstName = personList.get(id).getFirstName();
        String lastName = personList.get(id).getLastName();
        int insuranceNumber = personList.get(id).getInsuranceNumber();

        System.out.println("ID: " + personId + "\n" +
                "First name: " + firstName + "\n" +
                "Last name: " + lastName + "\n" +
                "Insurance number: " + insuranceNumber);
    }

    private ArrayList<Person> personList() {

        Person person = new Person(1, "Jackie", "Chan", 12345678);
        listOfPerson.add(person);

        Person person2 = new Person(2, "Robert", "Greene", 87654321);
        listOfPerson.add(person2);

        return listOfPerson;
    }
}

class Person{
    private int id;
    private String firstName;
    private String lastName;
    private int insuranceNumber;

    public Person(int id, String firstName, String lastName, int insuranceNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.insuranceNumber = insuranceNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(int insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", insuranceNumber=" + insuranceNumber +
                '}';
    }
}
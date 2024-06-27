package org.example;

public class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(){this.name = "Temik";}

    public Tester(String name){this(name, "Temik");}

    public Tester(String name, String surname) {
        this(name , surname, 2, "B1", 2000);
    }

    public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Name: " + name + "\nSurname: " + surname +"\nExpirience: " + expirienceInYears + " years" +
                "\nEnglish Level: " + englishLevel + "\nSalary: " + salary);
    }

    public void printInfo(int code) {
        System.out.println("\nCVC: " + code + "\nName: " + name + "\nSurname: " + surname + "\nExpirience: " + expirienceInYears + " years"
                + "\nEnglish Level: " + englishLevel);
    }

    public void printInfo(String num) {
        System.out.println("Number: " + num + "\nName: " + name + "\nSurname: " + surname + "\nExpirience: " + expirienceInYears + " years"
                + "\nEnglish Level: " + englishLevel);
    }
    public static void staticMethod() {
        System.err.println("Static method");
    }


}

package Inheritance;

//Single Inheritance

// Derived class can now access all the methods and data of the super class using the "Extends " keyword.

// Note - we are creating object of the dervied class here to access the data and method of main class

public class Company extends Employee {

    public  static void main (String args[])
    {
        Company c = new Company();

        System.out.print(c.Name);

    }




}


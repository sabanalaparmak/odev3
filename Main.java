package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
      Instructor ınstructor=new Instructor();
      ınstructor.setFirstName("Engin");
      ınstructor.setLastName("Demirog");
      InstructorManager ınstructormanager=new InstructorManager();
      ınstructormanager.add(ınstructor);

    }
}

package com.company;

public class InstructorManager extends Instructor{
    public void add(Instructor ınstructor){
        System.out.println(ınstructor.getFirstName()+" " + ınstructor.getLastName()+  "   Öğreticisi katıldı.");
    }
    public void delete(Instructor ınstructor){
        System.out.println(ınstructor.getFirstName()+ınstructor.getLastName()+"Öğreticisi silindi.");
    }
}

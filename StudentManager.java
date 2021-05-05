package com.company;

public class StudentManager extends Student{
    public void add (Student student){
        System.out.println(student.getFirstName()+student.getLastName()+"adlı öğrenci sisteme eklendi");
    }
    public void delete (Student student){
        System.out.println(student.getFirstName()+student.getLastName()+"adlı öğrenci sistemden çıkarıldı..");

    }
    public void homeworkmaking(Student student){
        System.out.println(student.getFirstName()+student.getLastName()+student.getHomework()+"öğrencimiz ödevini yapmıştır..");
    }

}

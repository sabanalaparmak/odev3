package com.company;

public class UserManager extends User{
  public void add(User user){
      System.out.println(user.getFirstName()+user.getLastName()+"Kişisi eklendi..");
  }
  public void delete(User user){
      System.out.println(user.getFirstName()+user.getLastName()+"Kişisi silindi");
  }

}

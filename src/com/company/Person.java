package com.company;

class Person {
    int Age;
    String Name;
    String z = "None";
    public Person(int age, String name) {
        Age = age;
        Name = name;
        System.out.print(age + " " + name);
    }
    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    String None(String k){
        k = z;
        return k;
    }
}

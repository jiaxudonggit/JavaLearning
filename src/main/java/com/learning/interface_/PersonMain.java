package com.learning.interface_;

public class PersonMain {
    public static void main(String[] args) {
        Student p = new Student("小明");
        p.run(); // 小明 run
        p.say(); // 小明 hello world
        System.out.println(p.getName()); // 小明
    }
}


interface Person {
    void run();

    String getName();
}

interface Hello {
    void say();
}

class Student implements Person, Hello {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name + " run");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void say() {
        System.out.println(this.name + " hello world");
    }
}
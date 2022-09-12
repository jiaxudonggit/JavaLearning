package com.learning.flood;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // ArrayList 是Java标准库提供的类型，它可以看作“可变长度”的数组，因为用起来比数组更方便。
        // List arrayList = new ArrayList();
        // arrayList.add("abc");
        // arrayList.add(100);

        List<String> arrayList = new ArrayList<>();
        arrayList.add("abc");
        arrayList.add("edf");
        // arrayList.add(100);

        for(int i = 0; i< arrayList.size();i++){
            String item = arrayList.get(i);
            System.out.println("泛型测试: item = " + item);
        }
    }
}

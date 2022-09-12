package com.learning.flood.type_erasure;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringArrayList = new ArrayList<String>();
        List<Integer> integerArrayList = new ArrayList<Integer>();

        Class classStringArrayList = stringArrayList.getClass();
        Class classIntegerArrayList = integerArrayList.getClass();

        System.out.println("classStringArrayList: " + classStringArrayList);
        System.out.println("classIntegerArrayList: " + classIntegerArrayList);

        if (classStringArrayList.equals(classIntegerArrayList)) {
            System.out.println("泛型测试: 类型相同");
        }
    }
}
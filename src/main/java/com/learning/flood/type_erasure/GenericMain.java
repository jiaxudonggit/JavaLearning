package com.learning.flood.type_erasure;

public class GenericMain<T>{ // T 就是参数化的类型
    public static void main(String[] args) {
        Generic<String> g = new Generic<>("Hello world");
        String key = g.getKey();
        System.out.println(key);
    }
}

class Generic<T>{
    // key这个成员变量的类型为T, T的类型由外部指定
    private T key;

    public Generic(T key) { // 泛型构造方法形参key的类型也为T，T的类型由外部指定
        this.key = key;
    }

    public T getKey(){ // 泛型方法getKey的返回值类型为T，T的类型由外部指定
        return key;
    }
}
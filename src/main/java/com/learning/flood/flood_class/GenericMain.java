package com.learning.flood.flood_class;

public class GenericMain {
    public static void main(String[] args) {
        /**
         * 泛型的类型参数只能是类类型（包括自定义类），不能是基本类型，例如：int、char
         * 泛型的类型参数只能是类类型（包括自定义类），不能是基本类型，例如：int、char
         */
        Generic<Integer> genericInteger = new Generic<Integer>(123456);

        // 传入的实参类型需与泛型的类型参数 类型相同，即为String.
        Generic<String> genericString = new Generic<String>("key_value");
        System.out.println("泛型测试: key is " + genericInteger.getKey());
        System.out.println("泛型测试: key is " + genericString.getKey());

        // 输出结果
        // 泛型测试: key is 123456
        // 泛型测试: key is key_value
    }
}

/**
 * 此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型
 * 在实例化泛型类时，必须指定T的具体类型
 */
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

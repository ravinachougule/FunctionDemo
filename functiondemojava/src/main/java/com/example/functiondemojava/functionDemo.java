package com.example.functiondemojava;

/**
 * Created by LENOVO on 23/03/2018.
 */

public class functionDemo {
    int a;
    functionDemo(){
        System.out.print("This is default constructor");
    }
    functionDemo(int a){
        this.a=a;
        System.out.println("a="+a);
    }

    //functions
    Boolean fun1(){
        return true;
    }
    int funInt(){
        int i=10;
        return i;
    }
    int fun3(int no){
        return  no;
    }
    public static void main(String args[]){
        functionDemo ob=new functionDemo();
        functionDemo ob1=new functionDemo(20);
        ob.fun1();
        ob.funInt();
        ob.fun3(30);


    }
}

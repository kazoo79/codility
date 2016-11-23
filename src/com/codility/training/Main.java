package com.codility.training;

public class Main {

    public static void main(String[] args) {
	// write your code here

        A a  = new B(10);
    }


    static class A {

        public A(){
            System.out.println("Default A");
        }

        public A(String s) {

        }

        public static void bbbb() {

        }
    }

    static class B extends A {


        public B(int i) {
            System.out.println("B");
        }

        public static void bbbb() {

        }
    }
}

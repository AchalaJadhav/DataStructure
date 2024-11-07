package com.asj.datastructure.other;

public class OuterClass {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        System.out.println("Outer Class");
    }

    static class InnerClass {
        public static void main(String[] args) {
            InnerClass in = new InnerClass();
            System.out.println("Inner Class");
        }
    }
}

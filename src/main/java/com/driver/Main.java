package com.driver;

public class Main {
    static class Product {
        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        //int x
        System.out.println(p.product(2, 3)); // should print 6
        System.out.println(p.product(2, 3, 4)); // should print 24
        System.out.println(p.product(2.5, 3.5)); // should print 8.75
    }
}
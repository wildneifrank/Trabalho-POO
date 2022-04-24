import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] naturais = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] pares = {0, 2, 4, 6, 8};
        int[] impares = {1, 3, 5, 7, 9};
        int[] primos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

        Set<Integer> prim = new HashSet<Integer>();
        Set<Integer> impar = new HashSet<Integer>();
        Set<Integer> par = new HashSet<Integer>();
        Set<Integer> nat = new HashSet<Integer>();

        System.out.println("Item A -> 4 é subconjunto de si mesmo :" + prim.containsAll(prim));
        System.out.println("Item B -> Pertinência do conjunto 2 e 3 :" + prim.containsAll(prim));
        System.out.println("Item A -> 4 é subconjunto de si mesmo :" + prim.containsAll(prim));
        System.out.println("Item A -> 4 é subconjunto de si mesmo :" + prim.containsAll(prim));
    }
}
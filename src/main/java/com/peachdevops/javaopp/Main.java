package com.peachdevops.javaopp;

import com.peachdevops.javaopp.logic.JavaSort;
import com.peachdevops.javaopp.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> bubbleSort = new JavaSort<>();

        System.out.println(bubbleSort.sort(Arrays.asList(args)));
    }
}

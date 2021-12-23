package com.peachdevops.springPractice;

import com.peachdevops.springPractice.config.Config;
import com.peachdevops.springPractice.logic.JavaSort;
import com.peachdevops.springPractice.logic.Sort;
import com.peachdevops.springPractice.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        SortService sortService = context.getBean(SortService.class);

        Sort<String> bubbleSort = new JavaSort<>();

        System.out.println("[result]" + sortService.doSort(Arrays.asList(args)));
    }
}

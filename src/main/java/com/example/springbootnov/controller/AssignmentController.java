package com.example.springbootnov.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AssignmentController {

        @RequestMapping("/name")
        public String names (){
            String name = "Gangadhar";


            return name;

        }
        @RequestMapping("/month")
        public ArrayList<Integer> month (){
            ArrayList<Integer> months = new ArrayList<>();
            months.add(1);
            months.add(2);
            months.add(3);
            months.add(4);
            months.add(5);
            months.add(6);
            months.add(7);
            months.add(8);
            months.add(9);
            months.add(10);
            months.add(11);
            months.add(12);
            return months;

        }


}

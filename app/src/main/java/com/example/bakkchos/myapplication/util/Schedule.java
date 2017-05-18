/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bakkchos.myapplication.util;

import java.util.ArrayList;

/**
 *
 * @author bakkchos
 */
public class Schedule {
    Filler filler;
    ArrayList<Subject> groupSched = new ArrayList<>();

    public Schedule() {
        filler = new Filler();
        filler.fillSchedule();
    }
    public ArrayList<Subject> fullSchedule(){
        return filler.listOfSubjects();
    }
    public ArrayList<Subject> byDaySchedule(String day){
        return filler.listOrderByDay(day);
    }
    public ArrayList<Subject> groupSchedule(ArrayList<Subject> list,String group){
        for(Subject x : list){
            if(x.getGrupa().contains(group) || x.getGrupa().contains("ALL")){
                this.groupSched.add(x);
            }
        }
        
        
        
        return this.groupSched;
    
    }
        
    
    
}

package com.cruzhacks.scheduleapp;

import java.util.LinkedList;

/**
 * Created by cante on 1/20/2018.
 */


public class Classes {
    public LinkedList<Assignment> assignments;  //LinkedList of assignments for a class
    public int colorAssigns;                    //colored label for each class
    public String classNames;                   //name of class
    public String days;                         //days held per week
    public int startTimeHour;                   //hour of start time
    public int startTimeMin;                    //minute of start time
    public int endTimeHour;                     //hour of end time
    public int endTimeMin;                      //minute of end time

    public Classes(Assignment assignment, int color, String name, String day, int startHour, int startMin, int endHour, int endMin) {
        this.assignments.add(assignment);
        this.colorAssigns = color;
        this.classNames = name;
        this.days = day;
        this.startTimeHour = startHour;
        this.startTimeMin = startMin;
        this.endTimeHour = endHour;
        this.endTimeMin = endMin;
    }

    public void changeTime(int startHour, int startMin, int endHour, int endMin) {
        this.startTimeHour = startHour;
        this.startTimeMin = startMin;
        this.endTimeHour = endHour;
        this.endTimeMin = endMin;
    }

    public void changeColor(int color) {
        this.colorAssigns = color;

    }

    public void changeDay(String day) {
        this.days = day;
    }



}

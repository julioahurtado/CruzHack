package com.cruzhacks.scheduleapp;
import java.util.LinkedList;
/**
 * Created by cante on 1/20/2018.
 */



public class Assignment {
    public String names;
    public int months;
    public int days;
    public int years;
    public boolean complete;


    public Assignment (String name, int month, int day, int year, boolean completed) {
        this.names = name;
        this.months = month;
        this.days = day;
        this.years = year;
        this.complete = completed;
    }
}



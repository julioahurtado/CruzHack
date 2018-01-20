package com.cruzhacks.scheduleapp;

import java.util.LinkedList;

/**
 * Created by cante on 1/20/2018.
 */

public class Classes {
    public LinkedList<Assignment> assignments;
    public int colorAssigns;
    public String classNames;
    public String days;
    public int startTime;
    public int endTime;

    public Classes(Assignment assignment, int color, String name, String day, int start, int end) {
        this.assignments.add(assignment);
        this.colorAssigns = color;
        this.classNames = name;
        this.days = day;
        this.startTime = start;
        this.endTime = end;
    }

}

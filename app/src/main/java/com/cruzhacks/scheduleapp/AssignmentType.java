package com.cruzhacks.scheduleapp;

import java.util.LinkedList;

/**
 * Created by cante on 1/20/2018.
 */

public class AssignmentType {
    public String nameType;
    public LinkedList<Assignment> assignments;
    public AssignmentType (String name, Assignment assign){
        this.nameType = name;
        assignments.add(assign);
    }
}

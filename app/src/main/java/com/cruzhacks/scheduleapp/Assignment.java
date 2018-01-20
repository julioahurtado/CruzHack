package com.cruzhacks.scheduleapp;
/**
 * Created by cante on 1/20/2018.
 */



public class Assignment {
    private String due_names;//the name/description of the assignment
    private int due_months;//month its due
    private int due_days;//day its due
    private int due_years;//year its due
    private boolean due_complete;//if its finished

    //***********************************************
    //Constructor: this will initialize all variables
    //to the specified values
    //***********************************************
    public Assignment (String due_name, int due_month, int due_day, int due_year, boolean due_completed)
    {
        this.due_names = due_name;
        this.due_months = due_month;
        this.due_days = due_day;
        this.due_years = due_year;
        this.due_complete = due_completed;
    }
    //***********************************************
    //This will change the variable to the given
    //value
    //***********************************************
    public boolean changeComplete(boolean due_complete)
    {
        this.due_complete=due_complete;
        return this.due_complete;
    }

    public int changeMonth(int due_months)
    {
        this.due_months=due_months;
        return this.due_months;
    }

    public int changeDay(int due_days)
    {
        this.due_days=due_days;
        return this.due_days;
    }

    public int changeYear(int due_years)
    {
        this.due_years=due_years;
        return this.due_years;
    }


    //***********************************************
    //This will return requested information
    //***********************************************
    public String getNames() {return this.due_names;}

    public int getMonths(){return this.due_months;}

    public int getDay(){return this.due_days;}

    public int getYears(){return this.due_years;}

    public boolean getComplete(){return this.due_complete;}


    //**********************************************
    //This will concat a the dates together to
    //return a string for the due date
    //**********************************************
    public String catDate() {return this.due_days+"/"+this.due_months+"/"+this.due_years;}





}



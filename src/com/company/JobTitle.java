package com.company;

public class JobTitle {
    private String title;
    private String jobNumber;


    public JobTitle() {
    }


    public JobTitle(String title, String jobNumber) {
        this.title = title;
        this.jobNumber = jobNumber;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }
}

package com.company;

import java.util.ArrayList;

public class Corporation {
    private String officialName;
    ArrayList<JobTitle> jobList;

    public Corporation() {
        jobList = new ArrayList<>();
    }

    public Corporation(String officialName) {
        this.officialName = officialName;
        jobList = new ArrayList<>();
    }

    public String getOfficialName() {
        return officialName;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }

    public ArrayList<JobTitle> getJobList() {
        return jobList;
    }

    public void setJobList(ArrayList<JobTitle> jobList) {
        this.jobList = jobList;
    }
    public void addJobTitle(JobTitle jobTitle){
        jobList.add(jobTitle);
    }
}

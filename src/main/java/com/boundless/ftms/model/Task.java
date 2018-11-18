package com.boundless.ftms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.*;
import java.sql.*;

@Entity
public class Task {

    @Id
    @GeneratedValue
    @Column(name = "name")
    private String name;

    @Column(name = "start_time")
    private Timestamp startTime = null;

    @Column(name = "end_time")
    private Timestamp endTime = null;

    @Column(name = "duration")
    private int duration; // in minutes

    @Column(name = "worker_id")
    private int workerID;

    @Column(name = "job_id")
    private int jobID;

    public Task() {
    }

    public Task(int duration, int workerID, int jobID) {
        this.duration = duration;
        this.workerID = workerID;
        this.jobID = jobID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkerID() {
        return workerID;
    }

    public void setWorkerID(int workerID) {
        this.workerID = workerID;
    }

    public int getJobID() {
        return jobID;
    }

    public void setJobID(int jobID) {
        this.jobID = jobID;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getStartTime() {
        return startTime;
    }
}

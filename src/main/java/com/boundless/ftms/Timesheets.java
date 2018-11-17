package com.boundless.ftms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.sql.*;

@Entity
public class Timesheets {

    @Id
    @GeneratedValue
    @Column(name = "timesheet_id")
    private String name;

    @Column(name = "worker_id")
    private int workerID;

    @Column(name = "job_id")
    private int jobID;

    @Column(name = "time_submitted")
    private Timestamp timeSumbitted = null;

    @Column(name = "approval_status")
    private String approvalStatus;

    @Column(name = "rejection_reason")
    private String rejectionReason;

    @Column(name = "time_approved")
    private Timestamp timeApproved = null;

    public String getName() {
        return name;
    }

    public int getWorkerID() {
        return workerID;
    }

    public int getJobID() {
        return jobID;
    }

    public Timestamp getTimeSumbitted() {
        return timeSumbitted;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public String getRejectionReason() {
        return rejectionReason;
    }

    public Timestamp getTimeApproved() {
        return timeApproved;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkerID(int workerID) {
        this.workerID = workerID;
    }

    public void setJobID(int jobID) {
        this.jobID = jobID;
    }

    public void setTimeSumbitted(Timestamp timeSumbitted) {
        this.timeSumbitted = timeSumbitted;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }

    public void setTimeApproved(Timestamp timeApproved) {
        this.timeApproved = timeApproved;
    }
}

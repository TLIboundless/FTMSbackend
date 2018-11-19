package com.boundless.ftms.model;

import javax.persistence.*;

@Entity
public class Jobs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "worker_id")
    private int worker_id;
    @Column (name = "supervisor_id")
    private int supervisor_id;
    @Column (name = "workorder_id")
    private int workorder_id;

    public Jobs() {}

    public Jobs(int workerID, int workorder_id, int supervisor_id){
        this.worker_id = workerID;
        this.workorder_id = workorder_id;
        this.supervisor_id = supervisor_id;
    }
    public int getWorker_id() {
        return worker_id;
    }

    public void setWorker_id(int worker_id) {
        this.worker_id = worker_id;
    }

    public int getSupervisor_id() {
        return supervisor_id;
    }

    public void setSupervisor_id(int supervisor_id) {
        this.supervisor_id = supervisor_id;
    }

    public int getWorkorder_id() {
        return workorder_id;
    }

    public void setWorkorder_id(int workorder_id) {
        this.workorder_id = workorder_id;
    }


}

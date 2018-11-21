package com.boundless.ftms.repository;
import com.boundless.ftms.model.Jobs;
import com.boundless.ftms.model.Timesheets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JobsRepository extends JpaRepository<Jobs, Integer>{

    // SQL queries
    String FIND_JOBS_FROM_WORKER = "SELECT * FROM jobs WHERE worker_id = ?1";

    String FIND_JOBS_FROM_JOB_ID = "SELECT * FROM jobs WHERE job_id = ?1";

    @Query(value = FIND_JOBS_FROM_WORKER, nativeQuery = true)
    public List<Jobs> findJobsFromWorker(int worker_id);

    @Query(value = FIND_JOBS_FROM_JOB_ID, nativeQuery = true)
    List<Jobs> findJobsFromJobId(int job_id);

}

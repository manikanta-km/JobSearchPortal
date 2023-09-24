package com.example.JobPortal.repo;

import com.example.JobPortal.model.Jobs;
import com.example.JobPortal.model.Type;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJobRepo extends CrudRepository<Jobs,Long> {

    List<Jobs> findByJobLocation(String location);
    List<Jobs> findByJobType(Type type);

    List<Jobs> findByJobSalaryGreaterThan(double salary);

    List<Jobs> findByCompanyName(String name);

    @Modifying
    @Query(value = "UPDATE JOB SET JOB_SALARY = (JOB_SALARY + JOB_SALARY*(:hike)) WHERE JOB_TYPE = :jobType", nativeQuery = true)
    void updateJobByType(float hike, String jobType);

    @Modifying
    @Query(value = "UPDATE JOB SET JOB_SALARY = (JOB_SALARY + JOB_SALARY*(:hike)) WHERE JOB_LOCATION = :jobLocation", nativeQuery = true)
    void updateJobByLocation(float hike, String jobLocation);
}

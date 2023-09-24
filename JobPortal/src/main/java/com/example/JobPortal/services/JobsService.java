package com.example.JobPortal.services;

import com.example.JobPortal.model.Jobs;
import com.example.JobPortal.model.Type;
import com.example.JobPortal.repo.IJobRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
public class JobsService {
    @Autowired
    IJobRepo iJobRepo;

    public String addJob(List<Jobs> newJob){
        iJobRepo.saveAll(newJob);
        return "New Job Added in Portal";
    }

    public List<Jobs> getJobById(Long id){
        return (List<Jobs>) iJobRepo.findAllById(Collections.singleton(id));
    }

    public List<Jobs> getAllJobs(){
        return (List<Jobs>) iJobRepo.findAll();
    }

    public String updateJobInfo(Long id,String location){
        Jobs cJobs = iJobRepo.findById(id).orElse(null);
        if(cJobs != null){
            cJobs.setJobLocation(location);
            iJobRepo.save(cJobs);
            return "Job Info Updated";
        }
        else{
            return "Job Not Found";
        }
    }

    public String deleteJob(Long id){
        iJobRepo.deleteById(id);
        return "Job Deleted";
    }

    public List<Jobs> getJobByLocation(String location){
        return iJobRepo.findByJobLocation(location);
    }

    public List<Jobs> getJobByType(Type type){
        return iJobRepo.findByJobType(type);
    }

    public List<Jobs> getJobsAboveSalary(double salary){
        return iJobRepo.findByJobSalaryGreaterThan(salary);
    }

    public List<Jobs> getJobByCompany(String cname){
        return iJobRepo.findByCompanyName(cname);
    }

    @Transactional
    public String updateJobByType(float hike, Type jobType){
        iJobRepo.updateJobByType(hike,jobType.name());
        return "updated";
    }

    @Transactional
    public String updateJobByLocation(float hike, String jobLocation){
        iJobRepo.updateJobByLocation(hike,jobLocation);
        return "updated";
    }
}

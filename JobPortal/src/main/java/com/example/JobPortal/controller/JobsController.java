package com.example.JobPortal.controller;

import com.example.JobPortal.model.Jobs;
import com.example.JobPortal.model.Type;
import com.example.JobPortal.services.JobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobsController {
    @Autowired
    JobsService jobsService;

    @PostMapping("job")
    public String addJob(@RequestBody List<Jobs> newJob){
        return jobsService.addJob(newJob);
    }
    @GetMapping("job/id/{id}")
    public List<Jobs> getJob(@PathVariable Long id){
        return jobsService.getJobById(id);
    }

    @GetMapping("jobs")
    public List<Jobs> getAllJobs(){
        return jobsService.getAllJobs();
    }

    @PutMapping("job/id/{id}/location/{location}")
    public String updateJobInfo(@PathVariable Long id, @PathVariable String location){
        return jobsService.updateJobInfo(id,location);
    }

    @DeleteMapping("job/id{id}")
    public String deleteJob(@PathVariable Long id){
        return jobsService.deleteJob(id);
    }

    @GetMapping("job/location/{location}")
    public List<Jobs> getJobByLocation(@PathVariable String location){
        return jobsService.getJobByLocation(location);
    }

    @GetMapping("job/type/{type}")
    public List<Jobs> getJobByType(@PathVariable Type type){
        return jobsService.getJobByType(type);
    }

    @GetMapping("job/salary/{salary}")
    public List<Jobs> getJobsAboveSalary(@PathVariable double salary){
        return jobsService.getJobsAboveSalary(salary);
    }

    @GetMapping("job/companyName/{companyName}")
    public List<Jobs> getJobByCompany(@PathVariable String cname){
        return jobsService.getJobByCompany(cname);
    }

    @PutMapping("job/hike/{hike}/type/{jobType}")
    public String updateJobByType(@PathVariable float hike, @PathVariable Type jobType){
        return jobsService.updateJobByType(hike,jobType);
    }

    @PutMapping("job/hike/{hike}/location/{location}")
    public String updateJobByLocation(@PathVariable float hike, @PathVariable String location){
        return jobsService.updateJobByLocation(hike,location);
    }
}

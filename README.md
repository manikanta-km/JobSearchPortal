# Job Portal API

This repository contains the backend code for a Job Portal API implemented in Java using the Spring Boot framework. The API provides endpoints for managing job listings.

## Table of Contents

- [Controller](#controller)
- [Endpoints](#endpoints)

## Controller

### JobsController

#### `addJob`

- **Endpoint:** `POST /job`
- **Description:** Adds a new job or jobs to the portal.
- **Request Body:**
  - `List<Jobs>`: List of job details to be added.
- **Response:** Returns a message indicating the success of the job addition.

#### `getJob`

- **Endpoint:** `GET /job/id/{id}`
- **Description:** Retrieves job(s) by ID.
- **Path Variables:**
  - `id`: ID of the job.
- **Response:** Returns a list of jobs matching the specified ID.

#### `getAllJobs`

- **Endpoint:** `GET /jobs`
- **Description:** Retrieves all jobs from the portal.
- **Response:** Returns a list of all jobs available.

#### `updateJobInfo`

- **Endpoint:** `PUT /job/id/{id}/location/{location}`
- **Description:** Updates the location information for a specific job.
- **Path Variables:**
  - `id`: ID of the job to be updated.
  - `location`: New location information.
- **Response:** Returns a message indicating the success of the job information update.

#### `deleteJob`

- **Endpoint:** `DELETE /job/id/{id}`
- **Description:** Deletes a job by ID.
- **Path Variables:**
  - `id`: ID of the job to be deleted.
- **Response:** Returns a message indicating the success of the job deletion.

#### `getJobByLocation`

- **Endpoint:** `GET /job/location/{location}`
- **Description:** Retrieves jobs based on location.
- **Path Variables:**
  - `location`: Location to filter jobs.
- **Response:** Returns a list of jobs in the specified location.

#### `getJobByType`

- **Endpoint:** `GET /job/type/{type}`
- **Description:** Retrieves jobs based on job type.
- **Path Variables:**
  - `type`: Type of job to filter.
- **Response:** Returns a list of jobs of the specified type.

#### `getJobsAboveSalary`

- **Endpoint:** `GET /job/salary/{salary}`
- **Description:** Retrieves jobs with a salary above the specified amount.
- **Path Variables:**
  - `salary`: Minimum salary value.
- **Response:** Returns a list of jobs with salaries above the specified amount.

#### `getJobByCompany`

- **Endpoint:** `GET /job/companyName/{companyName}`
- **Description:** Retrieves jobs based on company name.
- **Path Variables:**
  - `companyName`: Name of the company to filter jobs.
- **Response:** Returns a list of jobs associated with the specified company.

#### `updateJobByType`

- **Endpoint:** `PUT /job/hike/{hike}/type/{jobType}`
- **Description:** Updates the salary of jobs based on job type.
- **Path Variables:**
  - `hike`: Salary hike percentage.
  - `jobType`: Type of job to update.
- **Response:** Returns a message indicating the success of the job salary update based on type.

#### `updateJobByLocation`

- **Endpoint:** `PUT /job/hike/{hike}/location/{location}`
- **Description:** Updates the salary of jobs based on location.
- **Path Variables:**
  - `hike`: Salary hike percentage.
  - `location`: Location to update.
- **Response:** Returns a message indicating the success of the job salary update based on location.

package com.workout.schools.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.workout.schoolsEntity.school;
import com.workout.schoolsrepo.schoolRepo;
@RestController
public class homeController {

	
	private schoolRepo SchoolRepo;
	
	@GetMapping("/hi")
	public String hello()
	{
		return "wellcome to gk schools";
		
	}
	
	@PostMapping("/saveschool")
	public school savedata(@RequestBody school School)
	{
		SchoolRepo.save(School);
		return School;
		
	}
	
	@GetMapping("/getSchool/{schoolNo}")
	public school getschooldata(@PathVariable int schoolNo)
	{
		Optional<school>School=SchoolRepo.findById(schoolNo);
	school school1=School.get();
	return school1;
	}
	
	@DeleteMapping("/deleteschool/{schoolNo}")
	public String deleteschool(@PathVariable int schoolNo)
	{
	school School=	SchoolRepo.findById(schoolNo).get();
	
	if(School!=null)
		SchoolRepo.delete(School);
		return "deleted sucessfully";
	
	}
	
	@PutMapping("/update")
	public school updatestudent(@RequestBody school School)
	{
		SchoolRepo.save(School);
		return School;
	}
	@GetMapping("/getallSchool")
	public List<school> getAll(){
		List<school>  schoolList=SchoolRepo.findAll();
		
		return schoolList;
	}
	
}

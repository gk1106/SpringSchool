package com.workout.schoolsrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workout.schoolsEntity.school;

@Repository
public interface schoolRepo extends JpaRepository<school, Integer> {

}

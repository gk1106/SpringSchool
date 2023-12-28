package com.workout.schoolsEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Data
public class school {
@Id
private int SchoolNo;
private String schoolName;
private String schoolAddress;
@Override
public String toString() {
	return "school [SchoolNo=" + SchoolNo + ", schoolName=" + schoolName + ", schoolAddress=" + schoolAddress + "]";
}


}

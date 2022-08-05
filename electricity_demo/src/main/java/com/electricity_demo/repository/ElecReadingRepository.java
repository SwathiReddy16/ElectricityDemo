package com.electricity_demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.electricity_demo.entity.ElecReading;

public interface ElecReadingRepository extends JpaRepository<ElecReading,Long>{
	
	@Query("select e from ElecReading e where e.readingId=:readingId")
	public Optional <ElecReading> existElecReadingId(@Param(value = "readingId") Long readingId);


}

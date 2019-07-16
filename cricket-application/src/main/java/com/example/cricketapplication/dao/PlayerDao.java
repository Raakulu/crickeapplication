package com.example.cricketapplication.dao;

import java.util.List;

import org.assertj.core.internal.Integers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.cricketapplication.entity.PlayerEntity;

public interface PlayerDao extends JpaRepository<PlayerEntity,Integer> {

	@Query(nativeQuery=true,value="select id from cricket_app.player")
	public List<Integer> getIds();
	
	
	

}

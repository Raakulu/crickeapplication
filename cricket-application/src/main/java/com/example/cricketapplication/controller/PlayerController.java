package com.example.cricketapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.cricketapplication.beans.Player;
import com.example.cricketapplication.beans.PlayerInfo;
import com.example.cricketapplication.service.PlayerService;

@RestController
@RestControllerAdvice
public class PlayerController {
	
	@Autowired
	PlayerService service;
	
	@GetMapping(value="/getall")
	public List<PlayerInfo> getAllPlayers() {
		return service.getAllPlayers();
	}
	
	
	@PostMapping(value="/createplayer")
	public String createPlayer(RequestEntity<Player> requestObject ) {
		return service.createPlayer(requestObject.getBody());
	}
	
	@GetMapping(value="/getplayer/{id}")
	public ResponseEntity<?> getPlayer(@PathVariable("id") String requestObject ) {
		return service.getPlayer(requestObject);
	}
	
	@PutMapping(value="/getplayer/{id}")
	public String updatePlayer(RequestEntity<Player> requestObject) {
		return service.createPlayer(requestObject.getBody());
	}
	
	@DeleteMapping(value="/getplayer/{id}")
	public ResponseEntity<String> deletePlayer(@PathVariable("id") String requestObject ) {
		return service.deletePlayer(requestObject);
	}

}

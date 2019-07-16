package com.example.cricketapplication.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.cricketapplication.beans.Player;
import com.example.cricketapplication.beans.PlayerInfo;
import com.example.cricketapplication.dao.PlayerDao;
import com.example.cricketapplication.entity.PlayerEntity;
import com.example.cricketapplication.exception.MessageException;

@Service
public class PlayerService {
	
	@Autowired
	PlayerDao playerDao;

	public List<PlayerInfo> getAllPlayers() {
		List<PlayerEntity> playerList = playerDao.findAll();
				//System.out.println(playerList.size());
		List<PlayerInfo> playerDTO = playerList.stream().map(element -> new PlayerInfo(element.getId(),element.getName(),element.getAge(),element.getUrl())).collect(Collectors.toList());
		return playerDTO;
		
	}

	public String createPlayer(Player request) {
		try {
		PlayerEntity requestObject = convertEntity(request);
		playerDao.save(requestObject);
		return "success";
		}catch(Exception e) {
			return e.getLocalizedMessage();
		}
		
	}
	
	public PlayerEntity convertEntity(Player request){
		
		PlayerEntity requestObject = new PlayerEntity(request.getId(),request.getName(),request.getAge(),request.getUrl(),request.getNationality(),request.getPlayerType());
		return requestObject;
	}
	
	public Player convertBean(PlayerEntity request){
		
		Player requestObject = new Player(request.getId(),request.getName(),request.getAge(),request.getUrl(),request.getNationality(),request.getPlayerType());
		return requestObject;
	}

	public ResponseEntity<?> getPlayer(String requestObject) {
		try{
			if(getAllIds().contains(Integer.parseInt(requestObject)))
			return new ResponseEntity<Player>(convertBean(playerDao.findById(Integer.parseInt(requestObject)).get()),HttpStatus.OK);
		else
			throw new MessageException("Id is not present ");
	}catch(MessageException e) {
		e.printStackTrace();
		return new ResponseEntity<String>(e.toString(),HttpStatus.NOT_FOUND);
	}
	}

	public ResponseEntity<String> deletePlayer(String requestObject) {
		try{
			if(getAllIds().contains(Integer.parseInt(requestObject)))
				{
				playerDao.deleteById(Integer.parseInt(requestObject));
				return new ResponseEntity<String>("Deleted",HttpStatus.OK);
				}
			
			else
				throw new MessageException("Id is not present ");
		}catch(MessageException e) {
			e.printStackTrace();
			return new ResponseEntity<String>(e.toString(),HttpStatus.NOT_FOUND);
		}catch(Exception e) {
			return new ResponseEntity<String>(e.toString(),HttpStatus.NOT_FOUND);
		}
	}
	
	public List<Integer> getAllIds(){
		return playerDao.getIds();
	}

}

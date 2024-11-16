package com.Sumauma.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Sumauma.dslist.dto.GameDTO;
import com.Sumauma.dslist.dto.GameMinDTO;
import com.Sumauma.dslist.entities.Game;
import com.Sumauma.dslist.projections.GameMinProjection;
import com.Sumauma.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long Id) {
		Game result = gameRepository.findById(Id).get();
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}

	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long ListId) {
		List<GameMinProjection> result = gameRepository.searchByList(ListId);
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}

}

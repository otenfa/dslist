package com.Sumauma.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Sumauma.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

	
	
}

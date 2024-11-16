package com.Sumauma.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Sumauma.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
		
}

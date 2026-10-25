package com.gamerstat.backend.repository;

import com.gamerstat.backend.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
package com.gamerstat.backend.controller;

import com.gamerstat.backend.model.Player;
import com.gamerstat.backend.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
@CrossOrigin(origins = "*")
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    @PostMapping
    public Player addPlayer(@RequestBody Player player) {
        return playerRepository.save(player);
    }

    @PutMapping("/{id}")
    public Player updatePlayer(@PathVariable Long id, @RequestBody Player updatedPlayer) {
        return playerRepository.findById(id).map(player -> {
            player.setFullName(updatedPlayer.getFullName());
            player.setUsername(updatedPlayer.getUsername());
            player.setEmail(updatedPlayer.getEmail());
            if (updatedPlayer.getPassword() != null && !updatedPlayer.getPassword().isEmpty()) {
                player.setPassword(updatedPlayer.getPassword());
            }
            player.setDiscordContact(updatedPlayer.getDiscordContact());
            player.setCareerHeadline(updatedPlayer.getCareerHeadline());
            player.setRecruitmentStatus(updatedPlayer.getRecruitmentStatus());
            player.setMainGame(updatedPlayer.getMainGame());
            player.setPeakRank(updatedPlayer.getPeakRank());
            player.setMainRole(updatedPlayer.getMainRole());
            player.setSignatureLoadout(updatedPlayer.getSignatureLoadout());
            player.setKdRatio(updatedPlayer.getKdRatio());
            player.setWinRate(updatedPlayer.getWinRate());
            player.setHeadshotPercentage(updatedPlayer.getHeadshotPercentage());
            player.setAvgDamage(updatedPlayer.getAvgDamage());
            player.setMatchesPlayed(updatedPlayer.getMatchesPlayed());
            player.setMvpCount(updatedPlayer.getMvpCount());
            return playerRepository.save(player);
        }).orElseGet(() -> {
            updatedPlayer.setId(id);
            return playerRepository.save(updatedPlayer);
        });
    }

    @DeleteMapping("/{id}")
    public void deletePlayer(@PathVariable Long id) {
        playerRepository.deleteById(id);
    }
}

package com.gamerstat.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Account & Bio Details
    private String email;
    private String password;
    private String fullName;
    private String username; // IGN
    private String discordContact;
    private String careerHeadline;
    private String recruitmentStatus; // e.g., "Free Agent (LFT)", "Signed to Org"

    // Core & Advanced Game Telemetry
    private String mainGame;
    private String peakRank;
    private String mainRole;
    private String signatureLoadout; // e.g., "AUG / M1014" or "Jett / Vandal"
    private Double kdRatio;
    private Double winRate;
    private Double headshotPercentage;
    private Double avgDamage;
    private Integer matchesPlayed;
    private Integer mvpCount;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getDiscordContact() { return discordContact; }
    public void setDiscordContact(String discordContact) { this.discordContact = discordContact; }

    public String getCareerHeadline() { return careerHeadline; }
    public void setCareerHeadline(String careerHeadline) { this.careerHeadline = careerHeadline; }

    public String getRecruitmentStatus() { return recruitmentStatus; }
    public void setRecruitmentStatus(String recruitmentStatus) { this.recruitmentStatus = recruitmentStatus; }

    public String getMainGame() { return mainGame; }
    public void setMainGame(String mainGame) { this.mainGame = mainGame; }

    public String getPeakRank() { return peakRank; }
    public void setPeakRank(String peakRank) { this.peakRank = peakRank; }

    public String getMainRole() { return mainRole; }
    public void setMainRole(String mainRole) { this.mainRole = mainRole; }

    public String getSignatureLoadout() { return signatureLoadout; }
    public void setSignatureLoadout(String signatureLoadout) { this.signatureLoadout = signatureLoadout; }

    public Double getKdRatio() { return kdRatio; }
    public void setKdRatio(Double kdRatio) { this.kdRatio = kdRatio; }

    public Double getWinRate() { return winRate; }
    public void setWinRate(Double winRate) { this.winRate = winRate; }

    public Double getHeadshotPercentage() { return headshotPercentage; }
    public void setHeadshotPercentage(Double headshotPercentage) { this.headshotPercentage = headshotPercentage; }

    public Double getAvgDamage() { return avgDamage; }
    public void setAvgDamage(Double avgDamage) { this.avgDamage = avgDamage; }

    public Integer getMatchesPlayed() { return matchesPlayed; }
    public void setMatchesPlayed(Integer matchesPlayed) { this.matchesPlayed = matchesPlayed; }

    public Integer getMvpCount() { return mvpCount; }
    public void setMvpCount(Integer mvpCount) { this.mvpCount = mvpCount; }
}
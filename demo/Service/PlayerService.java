package com.example.demo.Service;

import com.example.demo.Entity.Player;
import com.example.demo.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerService  {
    @Autowired
    private PlayerRepository repository;
    //list player
    List<Player> players = new ArrayList<>();

//get all players
    public List<Player> getAllPlayers() {
        repository.findAll().forEach(players::add);
        return players;
    }

//get player by id
    public Player getIdOfPlayer(Long id){
        return players.stream().filter(t -> t.getId().equals(id)).findFirst().get();

    }

//add player
    public void addPlayer(Player player){
        repository.save(player);
    }
//update Player
    public void updatePlayer(Long id, Player player){
        repository.save(player);
    }

//delete player
    public void deletePlayer(long id){
        repository.deleteById(id);
    }
    public List<Player> sorted(){
        List<Player> scoreBoard = players.stream()
                .sorted(Comparator.comparing(Player::getXp).reversed())
                .limit(10).collect(Collectors.toList());
        scoreBoard.forEach(System.out::println);
        return scoreBoard;
    }
    public List<Player> sortedByOverall(){
        List<Player> scoreBoard = players.stream()
                .sorted(Comparator.comparing(Player::getOverall).reversed())
                .limit(10).collect(Collectors.toList());
        scoreBoard.forEach(System.out::println);
        return scoreBoard;
    }
    public List<Player> sortedByAttack(){
        List<Player> scoreBoard = players.stream()
                .sorted(Comparator.comparing(Player::getAttack).reversed())
                .limit(10).collect(Collectors.toList());
        scoreBoard.forEach(System.out::println);
        return scoreBoard;
    }
    public List<Player> sortedByCooking(){
        List<Player> scoreBoard = players.stream()
                .sorted(Comparator.comparing(Player::getCooking).reversed())
                .limit(10).collect(Collectors.toList());
        scoreBoard.forEach(System.out::println);
        return scoreBoard;
    }
    public List<Player> sortedbyCrafting(){
        List<Player> scoreBoard = players.stream()
                .sorted(Comparator.comparing(Player::getCrafting).reversed())
                .limit(10).collect(Collectors.toList());
        scoreBoard.forEach(System.out::println);
        return scoreBoard;
    }
    public List<Player> sortedByMagic(){
        List<Player> scoreBoard = players.stream()
                .sorted(Comparator.comparing(Player::getMagic).reversed())
                .limit(10).collect(Collectors.toList());
        scoreBoard.forEach(System.out::println);
        return scoreBoard;
    }
}

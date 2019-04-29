package com.example.demo.Controller;

import com.example.demo.Entity.Player;
import com.example.demo.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {



    @Autowired
    private final PlayerService playerService;


    PlayerController(PlayerService playerService){
        this.playerService = playerService;
    }


    @GetMapping("/all")
    public List<Player> getAllPlayers(){
        return playerService.getAllPlayers();
    }

    @GetMapping("/all/board")
    public List<Player> sorted(){
          return playerService.sorted();
    }

    @GetMapping("/all/overral")
    public List<Player> sortedByOverall(){
        return playerService.sortedByOverall();
    }

    @GetMapping("/all/attack")
    public List<Player> sortedByAttack(){
        return playerService.sortedByAttack();
    }

    @GetMapping("/all/cooking")
    public List<Player> sortedByCooking(){
        return playerService.sortedByCooking();
    }

    @GetMapping("/all/crafting")
    public List<Player> sortedbyCrafting(){
        return playerService.sortedbyCrafting();
    }

    @GetMapping("/all/magic")
    public List<Player> sortedByMagic(){
        return playerService.sortedByMagic();
    }

}




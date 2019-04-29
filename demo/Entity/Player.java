package com.example.demo.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

//classe jugador para guardar los datos de el usuario del juego y su identidad online
@Data
@Entity
@ToString
@NoArgsConstructor
@EqualsAndHashCode
public class Player {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "lvl", nullable = false)
    int lvl;

    @Column(name = "xp", nullable = false)
    long xp;

    @Column(name = "attack", nullable = false)
    int attack;

    @Column(name = "defense", nullable = false)
    int defense;

    @Column(name = "magic", nullable = false)
    int magic;

    @Column(name = "cooking", nullable = false)
    int cooking;

    @Column(name = "crafting", nullable = false)
    int crafting;

    @Column(name = "overall", nullable = false)
    int overall;

    //constructor
    public Player( String name, int lvl, long xp, int attack, int defense,
                  int magic, int cooking, int crafting) {

        this.name = name;
        this.lvl = lvl;
        this.xp = xp;
        this.attack = attack;
        this.defense = defense;
        this.magic = magic;
        this.cooking = cooking;
        this.crafting = crafting;
        this.overall = attack + defense + magic + cooking + crafting;

//        @JsonBackReference
//        @ManyToOne(fetch = FetchType.LAZY, targetEntity = Score-board.class)
    }
}

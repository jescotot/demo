package com.example.demo.Exception;

public class PlayerNotFoundException extends RuntimeException{

      PlayerNotFoundException(Long id) {
            super("Could not find Player " + id);
        }

}

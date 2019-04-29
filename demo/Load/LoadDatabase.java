package com.example.demo.Load;

import com.example.demo.Repository.PlayerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(PlayerRepository repository){
        return args -> {
//            log.info("Preloading" + repository.save(new Player("Xninjax",5,5264397,87,42,47,64,59 )));
//            log.info("Preloading" + repository.save(new Player("Cookiedough",7,7369852,96,22,37,79,69 )));
//            log.info("Preloading" + repository.save(new Player("Gatinel",4,4459387,27,72,79,64,72 )));
//            log.info("Preloading" + repository.save(new Player("Cmanu20",9,9874563,42,15,97,24,49 )));
//            log.info("Preloading" + repository.save(new Player("oRpBl",12,12264397,24,42,45,29,39 )));
//            log.info("Preloading" + repository.save(new Player("Falonso",7,7654397,67,16,42,42,68 )));
//            log.info("Preloading" + repository.save(new Player("XburgerX",2,2564397,52,62,76,90,77 )));
//            log.info("Preloading" + repository.save(new Player("XXtentacion",10,10264156,77,77,47,86,42 )));
//            log.info("Preloading" + repository.save(new Player("DarkNight",6,6264397,17,97,16,68,16 )));
//            log.info("Preloading" + repository.save(new Player("SuperBoB",10,10274598,27,98,35,24,24 )));
//            log.info("Preloading" + repository.save(new Player("Xninjax",5,5264397,87,42,47,64,59 )));
//            log.info("Preloading" + repository.save(new Player("kitinel",8,8369852,86,32,47,69,79 )));
//            log.info("Preloading" + repository.save(new Player("spagetinoodle",5,5459387,37,62,69,74,62 )));
//            log.info("Preloading" + repository.save(new Player("manu_20",8,8874563,32,25,87,14,59 )));
//            log.info("Preloading" + repository.save(new Player("KR7",13,13264397,34,52,35,19,49 )));
//            log.info("Preloading" + repository.save(new Player("Fangio",6,6654397,57,26,52,72,28 )));
//            log.info("Preloading" + repository.save(new Player("XcrabyX",3,3564397,51,61,75,80,67 )));
//            log.info("Preloading" + repository.save(new Player("69",11,11264156,67,87,57,76,52 )));
//            log.info("Preloading" + repository.save(new Player("BrightNight",7,7264397,27,87,26,78,26 )));
//            log.info("Preloading" + repository.save(new Player("SuperMan",11,11274598,37,88,45,74,64 )));

        };
    }
}

package com.example.ellaboatproject.services;


import com.example.ellaboatproject.models.Boat;
import com.example.ellaboatproject.models.Race;
import com.example.ellaboatproject.repositories.BoatRepository;
import com.example.ellaboatproject.repositories.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaceService {

    @Autowired
    private RaceRepository raceRepo;

    public List<Race> getAllRaces(){
        //Jeg har ikke implimenteret boatRepo.findAll det er bare noget der er der i JPA
        return raceRepo.findAll();
    }

    public void createRace (Race race) {
        raceRepo.save(race);
    }

    public void updateRace (Race race, int id) {
        var existing =  raceRepo.findById(id).orElse(null);

        // TODO

        raceRepo.save(existing);
    }

    public void deleteRace (int id) {
        raceRepo.deleteById(id);
    }

    public void setPointsInRace(int id, Race race) {
        var existing = raceRepo.findById(id).orElse(null);
            existing.setPoints(race.getPoints());
        raceRepo.save(existing);
    }
}

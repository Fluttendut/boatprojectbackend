package com.example.ellaboatproject.restcontroller;

import com.example.ellaboatproject.models.Race;
import com.example.ellaboatproject.services.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class RaceController {

    @Autowired
    RaceService raceService;

    @GetMapping("/races")
    public List<Race> getAllRaces () {
        return raceService.getAllRaces();
    }

    //Create
    @PutMapping("/createrace")
    public void createRace(@RequestBody Race race) {
        raceService.createRace(race);
    }

    //Update
    @PostMapping("/updaterace/{id}")
    public void updateRace(@RequestBody Race race, @PathVariable int id) {
        raceService.updateRace(race, id);
    }

    //Delete
    @DeleteMapping("/deleterace/{id}")
    public void deleteRace(@PathVariable int id) {
        raceService.deleteRace(id);
    }

    // This is used to set points, for an existing race/boat combo, by using the primary key of that row..
    @PostMapping("/updatescoreById/{id}")
    public void setPointsInRace (@PathVariable int id, @RequestBody Race race) {
        raceService.setPointsInRace(id, race);
    }
}

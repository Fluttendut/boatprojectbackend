package com.example.ellaboatproject.restcontroller;

import com.example.ellaboatproject.models.Boat;
import com.example.ellaboatproject.services.BoatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class BoatRestController {

    @Autowired
    BoatService boatService;

    // See all boats
    @GetMapping("/boats")
    public List<Boat> getAllBoats () {
        return boatService.getAllBoats();
    }

    //Create
    @PutMapping("/createboat")
    public void createBoat(@RequestBody Boat boat) {
        boatService.createBoat(boat);
    }

    //Update
    @PostMapping("/updateboat/{id}")
    public void updateBoat(@RequestBody Boat boat, @PathVariable int id) {
        boatService.updateBoat(boat, id);
    }

    //Delete
    @DeleteMapping("/deleteboat/{id}")
    public void deleteBoat(@PathVariable int id) {
        boatService.deleteBoat(id);
    }
}



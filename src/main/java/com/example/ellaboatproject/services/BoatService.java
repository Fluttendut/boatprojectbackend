package com.example.ellaboatproject.services;

import com.example.ellaboatproject.models.Boat;
import com.example.ellaboatproject.repositories.BoatRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class BoatService {

    @Autowired
    private BoatRepository boatRepo;

    public List<Boat> getAllBoats(){
        //Jeg har ikke implimenteret boatRepo.findAll det er bare noget der er der i JPA
        return boatRepo.findAll();
    }

    public void createBoat (Boat boat) {
        boatRepo.save(boat);
    }

    public void updateBoat (Boat boat, int id) {
        var existing =  boatRepo.findById(id).orElse(null);
            existing.setType(boat.getType());
            boatRepo.save(existing);
    }

    public void deleteBoat (int id) {
        boatRepo.deleteById(id);
    }
}

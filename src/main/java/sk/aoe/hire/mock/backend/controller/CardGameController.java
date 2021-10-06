package sk.aoe.hire.mock.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sk.aoe.hire.mock.backend.model.CardData;

@RestController
@RequestMapping(path = "/api")
public class CardGameController {
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(path = "/card")
    public ResponseEntity<CardData> saveCardData(@RequestBody CardData cardData) {
        return ResponseEntity.ok(cardData);
    }
}

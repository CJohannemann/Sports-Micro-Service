package app.controller;

import app.model.Player;
import app.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
@RequiredArgsConstructor
public class PlayerController {

    private final PlayerService playerService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/getAllPlayers")
    public Collection<Player> getAll() {
        return playerService.getAllPlayers();
    }

    @PostMapping("/savePlayer")
    public Player savePlayer(@RequestBody Player player) {

        return playerService.savePlayer(player);
    }

//    @GetMapping("/getPlayer/{playerLastName}")
//    public List<Player> getPlayerByLastName(@PathVariable String inPlayerName){
//        return repository.findPlayerByLastName(inPlayerName);
//    }

}

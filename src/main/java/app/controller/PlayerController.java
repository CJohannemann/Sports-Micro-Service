package app.controller;

import app.model.Player;
import app.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequiredArgsConstructor
public class PlayerController {

    private final PlayerService playerService;

    @GetMapping("/getAllPlayers")
    public Collection<Player> getAll() {
        return playerService.getAllPlayers();
    }

    @PostMapping(value = "/savePlayer", consumes = "application/json", produces = "application/json")
    public Player savePlayer(@RequestBody Player player) {

        return playerService.savePlayer(player);
    }

}

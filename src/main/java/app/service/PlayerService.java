package app.service;

import app.dao.PlayerRepository;
import app.model.Player;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/* import java.math.BigDecimal; */
import java.util.Collection;

@Slf4j
@Service
@RequiredArgsConstructor
public class PlayerService {

    private final PlayerRepository playerRepository;

    public Collection<Player> getAllPlayers() {

        return playerRepository.findAll();
    }

    public Player savePlayer(Player player) {
        var savedPlayer = playerRepository.save(player);

        log.debug(savedPlayer.getFirstName() + " " + savedPlayer.getLastName() + " was added to the " + savedPlayer.getTeamPlayingFor() + " lineup");
        // Code here to transform savedPlayer to API version
        return savedPlayer;
    }

  /*  BigDecimal calculateWinPercentage(Integer wins, Integer losses) {

    }*/
}

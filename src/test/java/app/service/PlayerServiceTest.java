package app.service;

import app.dao.PlayerRepository;
import app.model.Player;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PlayerServiceTest {

    @InjectMocks
    private PlayerService playerService;
    @Mock
    private PlayerRepository playerRepository;

    @Test
    public void test__getAllPlayers() {
        playerService.getAllPlayers();

        verify(playerRepository, times(1)).findAll();
        verifyNoMoreInteractions(playerRepository);
    }

    @Test
    public void test__savePlayer() {
        var playerToSave = new Player().setFirstName("firstName").setLastName("lastName")
                .setTeamPlayingFor("Random Team");
        var savedPlayer = playerToSave
            .setId(1);

        when(playerRepository.save(playerToSave)).thenReturn(savedPlayer);
        playerService.savePlayer(playerToSave);

        verify(playerRepository, times(1)).save(playerToSave);
        assertEquals(savedPlayer.getId(), 1);
    }
}

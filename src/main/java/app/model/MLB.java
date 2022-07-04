package app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MLB {
    private String sport;
    private String team;
    private Integer wins;
    private Integer losses;
    private LocalDate nextGame;
}

package app.model;

import lombok.Data;

@Data
public class MLS {
    private String sport;
    private String team;
    private Integer wins;
    private Integer losses;
    private String nextGame;
}

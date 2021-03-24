package com.codecool.chessopen;

public class Player {
    private String name;
    private Integer Points;


    public Player(String name, Integer Points  ) {
        this.name = name;
        this.Points = Points;

    }

    public void setName( String name ) {
        this.name = name;
    }

    public void setPoints( Integer Points ) {
        this.Points = Points;
    }

    public String getName() {
        return name;
    }

    public Integer getPoints() {
        return Points;
    }
}

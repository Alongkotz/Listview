package com.aon.listview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kwann on 12/9/2017.
 */

public class Shigingami {
    private String character;
    private int Id;
    private String description;
    List<Shigingami> shigingamiList = new ArrayList<>();

    public Shigingami(){

    }
    public Shigingami(int id, String character,String description){
        this.Id = id;
        this.character = character;
        this.description = description;
    }
    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Shigingami> getShigingamiList() {
        return shigingamiList;
    }

    public void setShigingamiList(List<Shigingami> shigingamiList) {
        this.shigingamiList = shigingamiList;
    }
}

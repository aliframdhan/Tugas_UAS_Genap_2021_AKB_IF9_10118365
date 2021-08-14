package app.thecity.model;

//13-08-2021 - 10118365 - Alif Ramdhan Kusaeri - IF9

import java.io.Serializable;

public class Images implements Serializable {
    public int place_id;
    public String name;

    public Images() {
    }

    public Images(int place_id, String name) {
        this.place_id = place_id;
        this.name = name;
    }

    public String getImageUrl(){
        return name;
    }
}

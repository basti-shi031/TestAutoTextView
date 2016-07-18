package com.basti.testautotextview;

/**
 * Created by Bowen on 2016-07-18.
 */
public class Part {

    String name;
    String id;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Part(String id, String name) {

        this.id = id;
        this.name = name;
    }

    public Part() {

    }

    @Override
    public String toString() {
        return name;
    }
}

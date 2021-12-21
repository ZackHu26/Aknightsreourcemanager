package com.example.resourcemanager;

public class Model
{
    String Name, Level, Drop, Craft, purl;

    Model()
    {}

    public Model(String name, String level, String drop, String craft, String purl) {
        this.Name = name;
        this.Level = level;
        this.Drop = drop;
        this.Craft = craft;
        this.purl = purl;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String level) {
        this.Level = level;
    }

    public String getDrop() {
        return Drop;
    }

    public void setDrop(String drop) {
        this.Drop = drop;
    }

    public String getCraft() {
        return Craft;
    }

    public void setCraft(String craft) {
        this.Craft = craft;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }
}

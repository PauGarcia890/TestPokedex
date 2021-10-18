package com.paugarciafontdecaba.pmdm.testpokedex;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

public class Pokemon implements Serializable {
    private String Name;
    private String Number;
    private String Description;
    private String[] Type;
    private String[] Weaknesses;
    private int ImageName;

    public Pokemon(String _name, String _num, String _desc, String[] _type, String[] _weak, int _image) {
        this.Name = _name;
        this.Number = _num;
        this.Description = _desc;
        this.Type = _type;
        this.Weaknesses = _weak;
        this.ImageName = _image;
    }

    public String GetName() {
        return this.Name;
    }

    public String GetNumber() {
        return this.Number;
    }

    public String GetDescription() {
        return this.Description;
    }

    public String[] GetType() {
        return this.Type;
    }

    public String[] GetWeaknesses() {
        return this.Weaknesses;
    }

    public int GetImageName() {
        return this.ImageName;
    }
}

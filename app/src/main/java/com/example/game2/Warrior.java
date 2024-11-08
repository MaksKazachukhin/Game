package com.example.game2;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Warrior implements Parcelable {
    private String name;
    private int age;
    private int health;


    public Warrior(String name, int age, int health) {
        this.name = name;
        this.age = age;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHealth() {
        return health;
    }

    protected Warrior(Parcel in) {
    }

    public static final Creator<Warrior> CREATOR = new Creator<Warrior>() {
        @Override
        public Warrior createFromParcel(Parcel in) {
            return new Warrior(in);
        }

        @Override
        public Warrior[] newArray(int size) {
            return new Warrior[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
    }
}

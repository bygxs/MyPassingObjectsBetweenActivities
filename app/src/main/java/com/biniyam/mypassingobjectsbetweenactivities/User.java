package com.biniyam.mypassingobjectsbetweenactivities;

import android.os.Parcel;
import android.os.Parcelable;

import java.security.PublicKey;

public class User implements Parcelable {
    String name, age, gender, city;

    public User(){

    }

    public User(String name, String age, String gender, String city) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.city = city;
    }

    protected User(Parcel in) {
        name = in.readString();
        age = in.readString();
        gender = in.readString();
        city = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(age);
        dest.writeString(gender);
        dest.writeString(city);
    }
}

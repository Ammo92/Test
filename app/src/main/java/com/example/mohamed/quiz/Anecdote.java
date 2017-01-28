package com.example.mohamed.quiz;

/**
 * Created by MOHAMED on 21/01/2017.
 */

public class Anecdote {
    private int thumbnail;
    private String text,count,count2,count3;

    public Anecdote(){}

    public Anecdote(String text, String count, String count2, String count3, int thumbnail)
    {
        this.text=text;
        this.count=count;
        this.count2=count2;
        this.count3=count3;
        this.thumbnail=thumbnail;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getCount2() {
        return count2;
    }

    public void setCount2(String count2) {
        this.count2 = count2;
    }

    public String getCount3() {
        return count3;
    }

    public void setCount3(String count3) {
        this.count3 = count3;
    }




}

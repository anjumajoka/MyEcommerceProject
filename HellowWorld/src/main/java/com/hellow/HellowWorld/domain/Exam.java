package com.hellow.HellowWorld.domain;

import java.util.List;

public class Exam {

    private Integer score;
    private List<Question> question1;

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public List<Question> getQuestion1() {
        return question1;
    }

    public void setQuestion1(List<Question> question1) {
        this.question1 = question1;
    }
}

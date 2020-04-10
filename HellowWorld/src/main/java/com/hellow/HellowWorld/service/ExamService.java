package com.hellow.HellowWorld.service;

import com.hellow.HellowWorld.domain.Exam;
import com.hellow.HellowWorld.domain.Question;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExamService {

    public Exam get1Exam(){
        List<Question> listOfQuestion = new ArrayList<>();

        Question question1 = new Question();
        question1.setQuestion("What is your name ?");
        question1.setAnswer("Anshul");

        Question question2 = new Question();
        question2.setQuestion("What is your name ?");
        question2.setAnswer("Anshul");

        listOfQuestion.add(question1);
        listOfQuestion.add(question2);


        Exam exam = new Exam();
        exam.setQuestion1(listOfQuestion);
        return exam;
    }
}

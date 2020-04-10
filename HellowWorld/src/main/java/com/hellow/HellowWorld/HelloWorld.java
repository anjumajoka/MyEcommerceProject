package com.hellow.HellowWorld;


import com.hellow.HellowWorld.domain.Exam;
import com.hellow.HellowWorld.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @Autowired
    ExamService examService;

    @RequestMapping("/")
    public String print(){
        return "hello world";
    }

    @RequestMapping("/exam1")
    public Exam getExam(){
        return new ExamService().get1Exam();
    }

    @RequestMapping("/exam")
    public Exam ping(){
        return examService.get1Exam();
    }
}

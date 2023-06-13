package com.codestates.stackoverflow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {
    @GetMapping("question")
    public String getQuestion() {
        return "question";
    }
}

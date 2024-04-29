package com.example.gametest.controller;

import com.example.gametest.service.QuizzService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizzController {
    private final QuizzService quizzService;

    public QuizzController(QuizzService quizzService) {
        this.quizzService = quizzService;
    }

    @GetMapping("/callspRandQuestion")
    @ResponseBody
    public String callSp(@RequestParam int theme, int level){
        return quizzService.convertListMapToJson(quizzService.callUserRepo(theme, level));
    }
}

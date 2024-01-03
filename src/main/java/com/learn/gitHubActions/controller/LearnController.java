package com.learn.gitHubActions.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/learnGithubActions")
public class LearnController {

    @GetMapping
    public ResponseEntity getMessage(){
        return ResponseEntity.ok("Hii!! welcome to github actions");
    }

}

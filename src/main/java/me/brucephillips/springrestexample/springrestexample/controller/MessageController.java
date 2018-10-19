package me.brucephillips.springrestexample.springrestexample.controller;


import org.springframework.web.bind.annotation.*;
import me.brucephillips.springrestexample.springrestexample.model.Message;

@RestController
public class MessageController {


    @GetMapping("/message")
    Message send() {

        return new Message("first message");
    }

    @PostMapping("/message")
    Message echo(@RequestBody Message message) {

        return message;
    }

}

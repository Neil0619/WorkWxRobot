package me.workwx.robot.controller;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import me.workwx.robot.dto.messageDto.StringMessageEnter;
import me.workwx.robot.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author : Niu
 * @className : RobotController
 * @description : TODO
 * @date: 2022/2/23
 **/
@Slf4j
@Valid
@CrossOrigin
@RestController
@RequestMapping
public class RobotController {

    @Autowired
    MessageService messageService;

    @GetMapping("/message")
    public HttpEntity<List<StringMessageEnter>> sendMessage1(StringMessageEnter enter) {
        log.info("hohohhohohohho");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/message")
    public HttpEntity<List<StringMessageEnter>> sendMessage(@RequestBody String url) {
        messageService.saveWebhook(url);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

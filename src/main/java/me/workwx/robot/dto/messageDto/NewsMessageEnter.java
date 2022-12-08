package me.workwx.robot.dto.messageDto;

import lombok.Data;

import jakarta.validation.constraints.NotNull;

/**
 * @author : Niu
 * @className : NewsMessageEnter
 * @description : TODO
 * @date: 2022/2/25
 **/
@Data
public class NewsMessageEnter {

    @NotNull
    private String msgtype;

    @NotNull
    private NewsEnter news;

}

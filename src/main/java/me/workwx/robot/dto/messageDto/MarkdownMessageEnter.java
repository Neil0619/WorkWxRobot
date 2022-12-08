package me.workwx.robot.dto.messageDto;

import lombok.Data;

import jakarta.validation.constraints.NotNull;

/**
 * @author : Niu
 * @className : StringMessageEnter
 * @description : TODO
 * @date: 2022/2/25
 **/
@Data
public class MarkdownMessageEnter {

    @NotNull
    private String msgType;

    @NotNull
    private MarkdownEnter markdown;

}

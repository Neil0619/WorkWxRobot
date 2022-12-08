package me.workwx.robot.dto.messageDto;

import lombok.Data;

import jakarta.validation.constraints.NotNull;

/**
 * @author : Niu
 * @className : TemplateCardMessageEnter
 * @description : TODO
 * @date: 2022/2/25
 **/
@Data
public class TemplateCardMessageEnter {

    @NotNull
    private String msgtype;

    @NotNull
    private String template_card;
}

package me.workwx.robot.dto.messageDto;

import lombok.Data;

import jakarta.validation.constraints.NotNull;

/**
 * @author : Niu
 * @className : ImageMessageEnter
 * @description : TODO
 * @date: 2022/2/25
 **/
@Data
public class ImageMessageEnter {

    @NotNull
    private String msgtype;

    @NotNull
    private ImageEnter image;

}

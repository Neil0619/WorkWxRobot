package me.workwx.robot.dto.messageDto;

import lombok.Data;

import jakarta.validation.constraints.NotNull;

/**
 * @author : Niu
 * @className : ImageEnter
 * @description : TODO
 * @date: 2022/2/25
 **/
@Data
public class ImageEnter {

    @NotNull
    private String base64;

    @NotNull
    private String md5;

}

package me.workwx.robot.dto.messageDto;

import lombok.Data;

import jakarta.validation.constraints.NotNull;

/**
 * @author : Niu
 * @className : FileEnter
 * @description : TODO
 * @date: 2022/2/25
 **/
@Data
public class FileEnter {

    @NotNull
    private String media_id;

}

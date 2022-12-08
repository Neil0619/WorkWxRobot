package me.workwx.robot.dto.messageDto;

import lombok.Data;

import jakarta.validation.constraints.NotNull;

/**
 * @author : Niu
 * @className : FileMessageEnter
 * @description : TODO
 * @date: 2022/2/25
 **/
@Data
public class FileMessageEnter {

    @NotNull
    private String msgtype;

    @NotNull
    private FileEnter file;

}

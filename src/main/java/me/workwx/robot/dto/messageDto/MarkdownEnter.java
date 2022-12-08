package me.workwx.robot.dto.messageDto;

import lombok.Data;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * @author : Niu
 * @className : MarkdownEnter
 * @description : TODO
 * @date: 2022/2/25
 **/
@Data
public class MarkdownEnter {

    @NotNull
    @Size(max = 4096)
    private String content;

}

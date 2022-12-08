package me.workwx.robot.dto.messageDto;

import lombok.Data;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * @author : Niu
 * @className : ArticlesEnter
 * @description : TODO
 * @date: 2022/2/25
 **/
@Data
public class ArticlesEnter {

    @NotNull
    @Size(max = 128)
    private String title;

    @Size(max = 512)
    private String description;

    @NotNull
    private String url;

    @NotNull
    private String picurl;

}

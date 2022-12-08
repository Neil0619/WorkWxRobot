package me.workwx.robot.dto.messageDto;

import lombok.Data;

import jakarta.validation.constraints.NotNull;
import java.util.List;

/**
 * @author : Niu
 * @className : NewsEnter
 * @description : TODO
 * @date: 2022/2/25
 **/
@Data
public class NewsEnter {

    @NotNull
    private List<ArticlesEnter> articles;

}

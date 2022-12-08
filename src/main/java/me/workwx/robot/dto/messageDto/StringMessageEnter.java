package me.workwx.robot.dto.messageDto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * @author : Niu
 * @className : CommonMessageDto
 * @description : TODO
 * @date: 2022/2/25
 **/
@Data
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "msgtype", visible=true, defaultImpl = StringMessageEnter.class)
@JsonSubTypes({
        @JsonSubTypes.Type(value = MarkdownMessageEnter.class, name = "markdown"),
        @JsonSubTypes.Type(value = ImageMessageEnter.class, name = "image"),
        @JsonSubTypes.Type(value = NewsMessageEnter.class, name = "news"),
        @JsonSubTypes.Type(value = FileMessageEnter.class, name = "file"),
        @JsonSubTypes.Type(value = FileMessageEnter.class, name = "template_card")
})
public class StringMessageEnter {

    @NotNull
    private String msgtype;

    @NotNull
    @Size(max = 2048)
    private String content;

    private String mentioned_list;

    private String mentioned_mobile_list;
}

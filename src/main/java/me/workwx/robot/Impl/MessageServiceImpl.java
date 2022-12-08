package me.workwx.robot.Impl;

import lombok.extern.slf4j.Slf4j;
import me.workwx.robot.service.MessageService;
import org.springframework.stereotype.Service;

/**
 * @author : Niu
 * @className : MessageServiceImpl
 * @description : TODO
 * @date: 2022/2/25
 **/
@Slf4j
@Service
public class MessageServiceImpl implements MessageService {

    @Override
    public void saveWebhook(String url) {
        log.info("hahahahahahahaha");
    }
}

package cn.net.liaowei.sc.message.receiver.listener;

import cn.net.liaowei.sc.message.receiver.binder.StreamSink;
import cn.net.liaowei.sc.message.common.CommonDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * @author LiaoWei
 */
@Component
@Slf4j
@EnableBinding(StreamSink.class)
public class StreamReceiver {
//    @StreamListener(StreamSink.INPUT)
//    public void process(CommonDTO object) {
//        log.info("Process stream common Object: {}", object);
//    }
}

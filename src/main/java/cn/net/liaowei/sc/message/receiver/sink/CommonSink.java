package cn.net.liaowei.sc.message.receiver.sink;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

/**
 * @author LiaoWei
 */
@Component
public interface CommonSink {
    String INPUT = "commonInput";

    @Input(CommonSink.INPUT)
    SubscribableChannel input();
}

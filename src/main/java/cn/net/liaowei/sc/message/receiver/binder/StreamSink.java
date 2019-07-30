package cn.net.liaowei.sc.message.receiver.binder;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

/**
 * @author LiaoWei
 */
@Component
public interface StreamSink {
    String INPUT = "StreamQueue";

    @Input(StreamSink.INPUT)
    SubscribableChannel input();
}

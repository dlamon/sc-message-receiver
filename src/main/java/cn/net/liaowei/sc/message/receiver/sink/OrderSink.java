package cn.net.liaowei.sc.message.receiver.sink;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author LiaoWei
 */
public interface OrderSink {
    String INPUT = "orderInput";

    @Input(OrderSink.INPUT)
    SubscribableChannel input();
}

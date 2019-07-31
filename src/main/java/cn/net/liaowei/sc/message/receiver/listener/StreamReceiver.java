package cn.net.liaowei.sc.message.receiver.listener;

import cn.net.liaowei.sc.message.common.CommonDTO;
import cn.net.liaowei.sc.message.receiver.sink.CommonSink;
import cn.net.liaowei.sc.message.receiver.sink.OrderSink;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * @author LiaoWei
 */
@Component
@Slf4j
@EnableBinding({CommonSink.class, OrderSink.class})
public class StreamReceiver {
    @StreamListener(CommonSink.INPUT)
    public void processCommon(CommonDTO object) {
        log.info("Process stream common Object: {}", object);
    }

    @StreamListener(value = OrderSink.INPUT, condition = "headers['type']=='fina'")
    public void processFina(CommonDTO object) {
        log.info("Process stream fina Object: {}", object);
    }

    @StreamListener(value = OrderSink.INPUT, condition = "headers['type']=='loan'")
    public void processLoan(CommonDTO object) {
        log.info("Process stream loan Object: {}", object);
    }
}

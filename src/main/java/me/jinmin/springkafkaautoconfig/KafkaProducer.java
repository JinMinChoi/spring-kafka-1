package me.jinmin.springkafkaautoconfig;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaProducer {
    private static final String TOPIC = "jinmin";
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String msg) {
        System.out.println(String.format("Produce message : %s", msg));
        kafkaTemplate.send(TOPIC, msg);
    }
}

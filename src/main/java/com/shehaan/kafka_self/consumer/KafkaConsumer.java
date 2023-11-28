package com.shehaan.kafka_self.consumer;

import com.shehaan.kafka_self.payload.Student;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
@ToString
public class KafkaConsumer {

//    @KafkaListener(topics = "devshehan",groupId = "myGroup")
    public void consumerMsg(String msg){
      log.info(format("Consuming message from devshehan Topic:: %s",msg));
    }

    @KafkaListener(topics = "devshehan",groupId = "myGroup")
    public void consumerJsonMsg(Student student){
        log.info(format("Consuming message from devshehan Topic:: %s",student.toString()));
    }
}

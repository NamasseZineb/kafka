package org.sid.demospringcloudstreamskafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sid.demospringcloudstreamskafka.entities.PageEvent;


import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.*;
import org.apache.kafka.streams.kstream.*;
import org.springframework.boot.CommandLineRunner;

import java.util.Properties;

@SpringBootApplication
public class DemoSpringcloudStreamsKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringcloudStreamsKafkaApplication.class, args);
    }

}

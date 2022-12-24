package dev.gustavoteixeira.demo.twitter.to.kafka.service;

import dev.gustavoteixeira.demo.twitter.to.kafka.service.config.DataConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@Slf4j
@SpringBootApplication
@RequiredArgsConstructor
public class MainApplication implements CommandLineRunner {

    private final DataConfig config;

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("App starts...");
        log.info(Arrays.toString(config.getTwitterKeywords().toArray(new String[]{})));
    }
}

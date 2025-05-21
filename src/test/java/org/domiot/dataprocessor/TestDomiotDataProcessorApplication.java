package org.domiot.dataprocessor;

import org.springframework.boot.SpringApplication;

public class TestDomiotDataProcessorApplication {

    public static void main(String[] args) {
        SpringApplication.from(DomiotDataProcessorApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}

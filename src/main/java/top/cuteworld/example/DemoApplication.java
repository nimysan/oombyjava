package top.cuteworld.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Slf4j
public class DemoApplication implements ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("Hello");
        List<byte[]> list = new ArrayList<>();
        int index = 1;
        while (true) {
            // 1MB each loop, 1 x 1024 x 1024 = 1048576
            byte[] b = new byte[1048576 * 32]; //32M
            list.add(b);
            Runtime rt = Runtime.getRuntime();
            log.info("{} free memory: {}", index++, rt.freeMemory());
        }
    }
}

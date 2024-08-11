package info.lotus.aws.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DemoController {

    @Value("${paramvalue1}")
    private String param1;

    @GetMapping("/parameter")
    public ResponseEntity getParameterValue()
    {
        System.out.println("param1 value from aws paramstore is" + param1);
        return ResponseEntity.ok("Parameter value got from aws paramstore is:" + param1);
    }

}

package com.example.consumerExample;

import com.example.consumerExample.dto.CustomerNavUpdate;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {
    @PostMapping(value="/samplenotificationendpoint/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Boolean registerNewPrice(@PathVariable Long id, @RequestBody CustomerNavUpdate<Double> update) {
        System.out.println(update.toString());
        return true;
    }
}

package org.example.cities;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @RequestMapping("/version")
    public String index() {
        return "Greetings newVMW Paris Roadshow from Orange Mars 13";
    }
}

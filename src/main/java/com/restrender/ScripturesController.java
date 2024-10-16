package com.restrender;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ScripturesController {

    static final List<String> scriptures=List.of(
            "John 3:16",
            "Psalm 23:1",
            "Proverbs 3:5-6",
            "Philippians 4:13");
    @GetMapping("/scriptures")
    public List<String> scriptures(){
     return scriptures;
    }
}

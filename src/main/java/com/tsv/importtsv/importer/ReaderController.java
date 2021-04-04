package com.tsv.importtsv.importer;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
@RequestMapping("/reader")
@AllArgsConstructor
public class ReaderController {
    private final NameBasicsRepository nameBasicsRepository;

    @GetMapping()
    public void getById(){
        File file = new File("C:\\data.tsv");
        nameBasicsRepository.saveAll(TsvReader.tsvr(file));
    }

    @GetMapping("/{id}")
    public void getById(@PathVariable(value = "id") Long id){

    }
}

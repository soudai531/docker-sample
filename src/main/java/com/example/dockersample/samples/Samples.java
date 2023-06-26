package com.example.dockersample.samples;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@Table(name = "samples")
public class Samples {
    @Id
    private int id;
    private String content;

    public Samples(String content) {
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }
}

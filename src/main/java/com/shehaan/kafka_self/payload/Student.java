package com.shehaan.kafka_self.payload;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student {
    private Integer id;
    private String firstName;
    private String lastName;
}

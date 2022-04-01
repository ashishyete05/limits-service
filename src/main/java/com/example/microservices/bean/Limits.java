package com.example.microservices.bean;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Limits {

    private int minimum;
    private int maximum;

}

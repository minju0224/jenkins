package com.hanwhaswcamp.jenkins.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class CalculatorDTO {

    @NonNull
    private Integer num1;
    @NonNull
    private Integer num2;
    private int sum;

}

package com.nsv.jsmbaba.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MatchedRule {
    private String reasonCode;
    private String reasonDescription;
    private String outcome;
}

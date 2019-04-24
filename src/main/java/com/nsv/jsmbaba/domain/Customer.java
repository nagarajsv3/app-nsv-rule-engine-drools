package com.nsv.jsmbaba.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Customer {
    private String name;
    private String status;
    private int deviceScore;
    private int walletScore;
    private List<MatchedRule> ruleList;
}

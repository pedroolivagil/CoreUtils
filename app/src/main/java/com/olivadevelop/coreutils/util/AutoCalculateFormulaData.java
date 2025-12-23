package com.olivadevelop.coreutils.util;

import com.olivadevelop.coreutils.component.BasicComponentView;

import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AutoCalculateFormulaData {
    private String formula;
    private List<Pair<String, BasicComponentView<?>>> components;
    private List<Pair<String, Double>> parameters;
}

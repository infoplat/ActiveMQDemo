package com.suyuening.echarts;

import static org.junit.Assert.*;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

public class OptionTest {
    @Test
    public void test_option() {
        Option option = new Option();
        option.backgroundColor("#000000");
        assertEquals("{\"backgroundColor\":\"#000000\"}", JSON.toJSONString(option));
    }
}

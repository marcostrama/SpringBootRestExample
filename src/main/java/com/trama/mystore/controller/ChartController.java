package com.trama.mystore.controller;

import java.util.List;

import com.trama.mystore.chart.Chart;
import com.trama.mystore.chart.Item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChartController {

    @Autowired
    private Chart chart;
    
    @RequestMapping(value = "/getchart", method = RequestMethod.GET)
    public Chart getChart() {
        return chart;
    }

    //TODO: Implement methods to make crud for the chart

}
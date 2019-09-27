package com.trama.mystore.chart;

import java.util.*;

public class Chart
{

    private List<Item> items;

    public Chart() {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public List<Item> getChartItems() {
        this.items.sort(Comparator.comparing(Item::getName));
        return this.items;
    }

    public Double getSumItems() {
        return this.items.stream().mapToDouble(o -> o.getPrice()).sum();
    }

}
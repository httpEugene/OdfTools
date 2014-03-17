package com.rest.hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Desmond
 * Date: 24.02.14
 * Time: 16:47
 * To change this template use File | Settings | File Templates.
 */

//@JsonIgnoreProperties(ignoreUnknown = true)
public class DrupalWorkersUnd {

    @JsonProperty(value = "und")
    private ArrayList<DrupalWorkersItems> fieldWorkers;

    public DrupalWorkersUnd() {

    }

    public DrupalWorkersUnd(ArrayList<DrupalWorkersItems> fieldWorkers){
        this.fieldWorkers = fieldWorkers;
    }
}

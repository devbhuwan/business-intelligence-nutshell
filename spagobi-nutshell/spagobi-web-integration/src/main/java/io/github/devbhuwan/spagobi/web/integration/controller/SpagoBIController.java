package io.github.devbhuwan.spagobi.web.integration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Bhuwan Prasad Upadhyay
 * @date 1/3/2017
 */
@Controller
public class SpagoBIController {

    @RequestMapping(value = "jsonp", method = RequestMethod.GET)
    public String byJsonp(Model model) {
        return "byJsonp.html";
    }

    @RequestMapping(value = "cors", method = RequestMethod.GET)
    public String byCors(Model model) {
        return "byCors.html";
    }

    @RequestMapping(value = "restApi", method = RequestMethod.GET)
    public String byRestApi(Model model) {
        return "byRestApi.html";
    }

}

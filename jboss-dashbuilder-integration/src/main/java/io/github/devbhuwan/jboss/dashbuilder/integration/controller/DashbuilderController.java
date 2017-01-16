package io.github.devbhuwan.jboss.dashbuilder.integration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Bhuwan Prasad Upadhyay
 * @date 1/16/2017
 */
@Controller
public class DashbuilderController {


    @RequestMapping(value = "jsApi", method = RequestMethod.GET)
    public String byJsApi(Model model) {
        return "byJsApi.html";
    }
}

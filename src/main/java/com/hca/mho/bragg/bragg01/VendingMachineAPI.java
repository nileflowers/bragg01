package com.hca.mho.bragg.bragg01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller()
public class VendingMachineAPI {

    @Autowired
    private VendingMachine vm;

    @ResponseBody
    @GetMapping("/buy")
    public Soda buySoda(@RequestParam(name = "name", required = false, defaultValue = "Dr Pepper") String name) {
        return vm.buySoda(name);
    }
}

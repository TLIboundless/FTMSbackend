package com.boundless.ftms.resource;

import java.util.List;

import com.boundless.ftms.model.WorkOrders;
import com.boundless.ftms.repository.WorkOrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/work_orders")
public class WorkOrdersController {

    @Autowired
    WorkOrdersRespository workOrdersRepository;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    private List<WorkOrders> getAll() {
        return workOrdersRepository.findAll();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveToDatabase(@RequestBody final WorkOrders workOrder){
        workOrdersRepository.save(workOrder);
        return "adding complete!";
    }


}

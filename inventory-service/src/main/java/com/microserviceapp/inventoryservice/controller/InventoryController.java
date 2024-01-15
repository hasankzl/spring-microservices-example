package com.microserviceapp.inventoryservice.controller;

import com.microserviceapp.inventoryservice.dto.InventoryResponse;
import com.microserviceapp.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCodeList) throws InterruptedException {

        return inventoryService.isInStock(skuCodeList);
    }

}

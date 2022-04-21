package com.forbusypeople.budget.controllers;

import com.forbusypeople.budget.services.AssetsService;
import com.forbusypeople.budget.services.dtos.AssetsDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/assets")
public class AssetsController {

    private final AssetsService assetsService;

    public AssetsController(AssetsService assetsService) {
        this.assetsService = assetsService;
    }

    @GetMapping
    public ResponseEntity<AssetsDto> getAssets() {
        return ResponseEntity.ok(assetsService.getAllAssets());
    }

}

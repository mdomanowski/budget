package com.forbusypeople.budget.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("/assets")
public class AssetsController {

    @GetMapping
    public ResponseEntity<Dto> getAssets() {
        Dto dto = new Dto();
        dto.setAssets(asList(1, 3, 5));
        return ResponseEntity.ok(dto);
    }

    private class Dto {
        private List<Integer> assets;

        public void setAssets(List<Integer> assets) {
            this.assets = assets;
        }

        public List<Integer> getAssets() {
            return assets;
        }
    }
}

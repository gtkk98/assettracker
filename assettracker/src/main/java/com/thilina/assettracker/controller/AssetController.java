package com.thilina.assettracker.controller;

import com.thilina.assettracker.model.Asset;
import com.thilina.assettracker.service.AssetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping

public class AssetController {
    private final com.thilina.assettracker.service.AssetService assetService;

    public AssetController(AssetService assetService) {
        this.assetService = assetService;
    }

    @PostMapping
    public Asset createAsset(@RequestBody Asset asset) {
        return assetService.createAsset(asset);
    }

    @GetMapping
    public List<Asset> getAllAsset() {
        return assetService.getAllAssets();
    }

    @GetMapping("/overdue")
    public List<Asset> getOverAsset() {
        return assetService.getOverdueAssets();
    }
}

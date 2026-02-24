package com.thilina.assettracker.service;

import com.thilina.assettracker.model.Asset;
import com.thilina.assettracker.repository.AssetRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Serivce
public class AssetService {
    private final AssetRepository assetRepository;

    public AssetService(AssetRepository assetRepository) {
        this.assetRepository = assetRepository;
    }

    public Asset createAsset(Asset asset) {
        return assetRepository.save(asset);
    }

    public List<Asset> getAllAssets() {
        return assetRepository.findAll();
    }

    public List<Asset> getOverdueAssets() {
        return assetRepository.findAll()
                .stream()
                .filter(a -> a.getNextServiceDate() != null &&
                        a.getNextServuceDate().isBefore(LocalDate.now()))
                .toList();
    }
}

package com.thilina.assettracker.repository;

import com.thilina.assettracker.model.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssetRepository extends JpaRepository<Asset, Long> {

    List<Asset> findByStatus(String status);
}

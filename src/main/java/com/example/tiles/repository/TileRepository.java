package com.example.tiles.repository;

import com.example.tiles.entity.Tile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TileRepository extends JpaRepository<Tile, Long> {
}
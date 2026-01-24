package com.example.tiles.service;

import com.example.tiles.entity.Tile;
import com.example.tiles.repository.TileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TileService {

    @Autowired
    private TileRepository repo;

    public List<Tile> getAll() {
        return repo.findAll();
    }

    public Tile save(Tile tile) {
        return repo.save(tile);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}

package com.example.tiles.controller;

import com.example.tiles.entity.Tile;
import com.example.tiles.service.TileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(
    originPatterns = {
        "https://tiles-warehouse-frontend.vercel.app",
        "https://tiles-warehouse-frontend-*.vercel.app",
        "http://localhost:*"
    },
    methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS}
)
@RequestMapping("/tiles")
public class TileController {

    @Autowired
    private TileService service;

    @GetMapping
    public List<Tile> getAllTiles() {
        return service.getAll();
    }

    @PostMapping
    public Tile addTile(@RequestBody Tile tile) {
        return service.save(tile);
    }

    @PutMapping("/{id}")
    public Tile updateTile(@PathVariable Long id, @RequestBody Tile tile) {
        tile.setId(id);
        return service.save(tile);
    }

    @DeleteMapping("/{id}")
    public void deleteTile(@PathVariable Long id) {
        service.delete(id);
    }


}

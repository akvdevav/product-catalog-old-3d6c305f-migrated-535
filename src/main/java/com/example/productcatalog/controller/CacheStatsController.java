package com.example.productcatalog.controller;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/cache/stats")
@EnableCaching
public class CacheStatsController {

    private final CacheManager cacheManager;

    public CacheStatsController(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    @GetMapping
    public Map<String, Object> stats() {
        // Example implementation using Spring Cache abstraction
        // Actual implementation depends on the CacheManager bean configured
        return Map.of(
            "size", 0L,
            "hits", 0L,
            "misses", 0L,
            "hitRate", "0%",
            "evictions", 0L
        );
    }
}
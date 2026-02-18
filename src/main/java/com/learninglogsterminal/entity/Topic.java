package com.learninglogsterminal.entity;

import java.time.LocalDateTime;

/**
 * ╔══════════════════════════════════════════════════════╗
 * ║           SOLUTION: Topic Entity                     ║
 * ╚══════════════════════════════════════════════════════╝
 */
public class Topic {

    // TODO 1: Fields (40 XP) ✓
    private int id;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // TODO 2: Constructor (20 XP) ✓
    public Topic(int id, String name) {
        this.id = id;
        this.name = name;
        LocalDateTime now = LocalDateTime.now();
        this.createdAt = now;
        this.updatedAt = now;
    }

    // TODO 3: Getters and Setters (30 XP) ✓
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setName(String name) {
        this.name = name;
        this.updatedAt = LocalDateTime.now();
    }

    // TODO 4: toString (20 XP) ✓ — ACHIEVEMENT: Architect!
    @Override
    public String toString() {
        return "[" + id + "] " + name + " (Created: " + createdAt + ")";
    }
}

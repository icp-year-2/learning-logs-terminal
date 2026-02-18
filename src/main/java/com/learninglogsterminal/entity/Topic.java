package com.learninglogsterminal.entity;

import java.time.LocalDateTime;

/**
 * ╔══════════════════════════════════════════════════════╗
 * ║           QUEST: Build the Topic Entity              ║
 * ║                                                      ║
 * ║   Complete all TODOs below to earn XP!               ║
 * ║   Total XP available in this file: 90 XP             ║
 * ╚══════════════════════════════════════════════════════╝
 *
 * A Topic represents a subject you are learning about.
 * Each topic has:
 *   - id         (int)            → unique identifier
 *   - name       (String)         → topic name
 *   - createdAt  (LocalDateTime)  → when it was created
 *   - updatedAt  (LocalDateTime)  → when it was last updated
 */
public class Topic {

    // ============================================================
    // TODO 1: Declare the fields (+10 XP each = 40 XP)
    // ============================================================
    // Declare these private fields:
    //   - int id
    //   - String name
    //   - LocalDateTime createdAt
    //   - LocalDateTime updatedAt
    //
    // Hint: private int id;
    // ============================================================



    // ============================================================
    // TODO 2: Create the constructor (+20 XP)
    // ============================================================
    // Create a constructor that takes (int id, String name)
    // Inside the constructor:
    //   - Set this.id = id
    //   - Set this.name = name
    //   - Store LocalDateTime.now() in a variable first
    //   - Set this.createdAt and this.updatedAt to that variable
    //
    // Hint:
    //   public Topic(int id, String name) {
    //       this.id = id;
    //       this.name = name;
    //       LocalDateTime now = LocalDateTime.now();
    //       this.createdAt = now;
    //       this.updatedAt = now;
    //   }
    // ============================================================



    // ============================================================
    // TODO 3: Create getters and setters (+30 XP)
    // ============================================================
    // Create these methods:
    //   - getId()        → returns id
    //   - getName()      → returns name
    //   - getCreatedAt() → returns createdAt
    //   - getUpdatedAt() → returns updatedAt
    //   - setName(String name) → sets name AND updates updatedAt
    //
    // Hint for setName:
    //   public void setName(String name) {
    //       this.name = name;
    //       this.updatedAt = LocalDateTime.now();
    //   }
    // ============================================================



    // ============================================================
    // TODO 4: Override toString() (+20 XP — ACHIEVEMENT: Architect!)
    // ============================================================
    // Return a readable string like:
    //   "[1] Java Basics (Created: 2025-02-18T10:30:00)"
    //
    // Hint: return "[" + id + "] " + name + " (Created: " + createdAt + ")";
    // ============================================================


}

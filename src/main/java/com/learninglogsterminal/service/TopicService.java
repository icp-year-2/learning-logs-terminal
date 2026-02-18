package com.learninglogsterminal.service;

import com.learninglogsterminal.entity.Topic;
import java.util.ArrayList;
import java.util.List;

/**
 * ╔══════════════════════════════════════════════════════╗
 * ║         QUEST: Build the Topic Service               ║
 * ║                                                      ║
 * ║   Complete all TODOs below to earn XP!               ║
 * ║   Total XP available in this file: 70 XP             ║
 * ╚══════════════════════════════════════════════════════╝
 *
 * TopicService manages a collection of Topics.
 * It uses an ArrayList to store topics in memory.
 */
public class TopicService {

    private final List<Topic> topics = new ArrayList<>();
    private int nextId = 1;

    // ============================================================
    // TODO 5: Implement addTopic() (+30 XP)
    // ============================================================
    // This method should:
    //   1. Create a new Topic using nextId and the given name
    //   2. Add it to the topics list
    //   3. Increment nextId by 1
    //   4. Return the created Topic
    //
    // Hint:
    //   Topic topic = new Topic(nextId, name);
    //   topics.add(topic);
    //   nextId++;
    //   return topic;
    // ============================================================
    public Topic addTopic(String name) {
        // Write your code here

        return null; // ← Replace this
    }

    // ============================================================
    // TODO 6: Implement getAllTopics() (+20 XP)
    // ============================================================
    // This method should:
    //   Return the list of all topics
    //
    // Hint: return topics;
    // ============================================================
    public List<Topic> getAllTopics() {
        // Write your code here

        return null; // ← Replace this
    }

    // ============================================================
    // TODO 7: Implement getTopicCount() (+20 XP — ACHIEVEMENT: Engineer!)
    // ============================================================
    // This method should:
    //   Return how many topics are in the list
    //
    // Hint: return topics.size();
    // ============================================================
    public int getTopicCount() {
        // Write your code here

        return 0; // ← Replace this
    }
}

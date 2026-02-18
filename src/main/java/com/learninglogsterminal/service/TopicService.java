package com.learninglogsterminal.service;

import com.learninglogsterminal.entity.Topic;
import java.util.ArrayList;
import java.util.List;

/**
 * ╔══════════════════════════════════════════════════════╗
 * ║           SOLUTION: Topic Service                    ║
 * ╚══════════════════════════════════════════════════════╝
 */
public class TopicService {

    private final List<Topic> topics = new ArrayList<>();
    private int nextId = 1;

    // TODO 5: addTopic (30 XP) ✓
    public Topic addTopic(String name) {
        Topic topic = new Topic(nextId, name);
        topics.add(topic);
        nextId++;
        return topic;
    }

    // TODO 6: getAllTopics (20 XP) ✓
    public List<Topic> getAllTopics() {
        return topics;
    }

    // TODO 7: getTopicCount (20 XP) ✓ — ACHIEVEMENT: Engineer!
    public int getTopicCount() {
        return topics.size();
    }
}

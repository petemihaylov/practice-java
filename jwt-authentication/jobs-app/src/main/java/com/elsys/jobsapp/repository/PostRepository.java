package com.elsys.jobsapp.repository;

import java.util.List;

import com.elsys.jobsapp.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
    List<Post> findByTopic(String topic);
}
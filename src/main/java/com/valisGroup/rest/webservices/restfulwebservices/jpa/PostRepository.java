package com.valisGroup.rest.webservices.restfulwebservices.jpa;

import com.valisGroup.rest.webservices.restfulwebservices.posts.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}

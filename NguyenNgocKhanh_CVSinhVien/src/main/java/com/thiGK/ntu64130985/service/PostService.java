package com.thiGK.ntu64130985.service;

import com.thiGK.ntu64130985.models.Post;
import com.thiGK.ntu64130985.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
	 @Autowired
	    private PostRepository postRepository;

	    public List<Post> getAllPosts() {
	        return postRepository.findAll();
	    }

	    public Optional<Post> getPostById(Long id) {
	        return postRepository.findById(id);
	    }

	    public void savePost(Post post) {
	        postRepository.save(post);
	    }

	    public void deletePost(Long id) {
	        postRepository.deleteById(id);
	    }
}

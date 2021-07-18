package com.example.onetomany;

import com.example.onetomany.entity.Comment;
import com.example.onetomany.entity.Post;
import com.example.onetomany.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToManyApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(OneToManyApplication.class, args);
    }

    @Autowired
    private PostRepository postRepository;


    @Override
    public void run(String... args) throws Exception {

        Post post=new Post("OneToMany mapping using jpa","OneToMany mapping using jpa repository");


        Comment comment=new Comment("birinchi");
        Comment comment1=new Comment("ikkinchi");
        Comment comment2=new Comment("uchinchi");


        post.getComments().add(comment);
        post.getComments().add(comment1);
        post.getComments().add(comment2);

        this.postRepository.save(post);



    }





}

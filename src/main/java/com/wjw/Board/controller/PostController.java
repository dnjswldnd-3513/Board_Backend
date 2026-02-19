package com.wjw.Board.controller;


import com.wjw.Board.entity.Post;
import com.wjw.Board.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://localhost:3000"}) //즉 front보고 3000으로 들어오라고 하는거죠
public class PostController {
    private final PostService postService;
    //todo : getbydi, getAlL, create, update, delete

    @GetMapping
    public List<Post> getAll(){
        return postService.getAll();
    }

    @GetMapping("/{id}")
    public Post getById(@PathVariable Long id){
        return postService.getById(id);
    }


    @PostMapping
    public ResponseEntity<Post> create(@RequestBody Post post){
        return ResponseEntity.ok(postService.join(post));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Post> update(@PathVariable Long id,@RequestBody Post post) {
        return ResponseEntity.ok(postService.update(id,post));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Post> delete(@PathVariable Long id){
        postService.delete(id);
        return ResponseEntity.noContent().build();
    }
    //findby

}

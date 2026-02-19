package com.wjw.Board.service;


import com.wjw.Board.entity.Post;
import com.wjw.Board.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    //findall,findbyid,create,delete,update


    public List<Post> getAll(){
        return  postRepository.findAll();
    }

    public Post getById(Long id){
        return  postRepository.findById(id).orElseThrow(() -> new RuntimeException("검색되는 게시글이 없습니다."));
    }

    public Post join(Post post){
        return postRepository.save(post);
    }

    public void delete(Long id){
        postRepository.deleteById(id);
    }


    public Post update(Long id,Post update){
        Post po = getById(id);
        po.setTitle(update.getTitle());
        po.setContent(update.getContent());
       return postRepository.save(po);
    }



}

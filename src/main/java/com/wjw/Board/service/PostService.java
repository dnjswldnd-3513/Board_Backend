package com.wjw.Board.service;


import com.wjw.Board.dto.PostRequestDto;
import com.wjw.Board.dto.PostResponseDto;
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

    private PostResponseDto toDto(Post post) {
        return new PostResponseDto(
                post.getId(),
                post.getTitle(),
                post.getContent(),
                post.getCreatedAt()
        );
    }


    public List<PostResponseDto> getAll(){
        return  postRepository.findAll().stream().map(post -> toDto(post)).toList();
    }

    public PostResponseDto getById(Long id){
        Post pos=  postRepository.findById(id).orElseThrow(() -> new RuntimeException("검색되는 게시글이 없습니다."));
        return  toDto(pos);
    }

    public PostResponseDto join(PostRequestDto post){
        Post post1 = new Post();
        post1.setTitle(post.title());
        post1.setContent(post.content());
        return toDto(postRepository.save(post1));
    }

    public void delete(Long id){
        postRepository.deleteById(id);
    }


    public PostResponseDto update(Long id, PostRequestDto update){
       Post pos = postRepository.findById(id).orElseThrow(() -> new RuntimeException("null"));
        pos.setTitle(update.title());
        pos.setContent(update.content());
        return toDto(postRepository.save(pos));
    }



}

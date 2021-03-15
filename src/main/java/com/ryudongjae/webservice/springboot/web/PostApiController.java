package com.ryudongjae.webservice.springboot.web;

import com.ryudongjae.webservice.springboot.service.posts.PostService;
import com.ryudongjae.webservice.springboot.web.dto.PostsResponseDto;
import com.ryudongjae.webservice.springboot.web.dto.PostsSaveRequestDto;
import com.ryudongjae.webservice.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class PostApiController {

    private final PostService postService;

    @GetMapping("api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){

        return postService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id,@RequestBody PostsUpdateRequestDto requestDto){
        return postService.update(id,requestDto);
    }
    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById (@PathVariable Long id){

        return postService.findById(id);
    }




}

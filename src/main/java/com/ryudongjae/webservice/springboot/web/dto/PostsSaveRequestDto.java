package com.ryudongjae.webservice.springboot.web.dto;

import com.ryudongjae.webservice.springboot.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;
    @Builder
    public PostsSaveRequestDto(String title,String content,String auther){
        this.title = title;
        this.content = content;
        this.author = auther;
    }

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .auther(author)
                .build();
    }
}

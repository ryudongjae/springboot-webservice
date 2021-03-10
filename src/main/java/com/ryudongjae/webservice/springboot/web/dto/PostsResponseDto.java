package com.ryudongjae.webservice.springboot.web.dto;

import com.ryudongjae.webservice.springboot.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {
   private Long id;
   private String title;
   private String content;
   private String auther;

   public PostsResponseDto(Posts entity){

       this.id = entity.getId();
       this.title =entity.getTitle();
       this.content =entity.getContent();
       this.auther =entity.getAuther();
   }

}

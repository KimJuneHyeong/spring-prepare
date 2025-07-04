package com.metabus.springprepare.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter // 값 변경
@NoArgsConstructor// 기본 생성자 생성 애너테이션
@AllArgsConstructor
public class Memo {
    private String username;
    private String content;
    private String description;
    private String password;

}

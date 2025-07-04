package com.metabus.springprepare.domain;


import lombok.*;

//@Getter
//@Setter // 값 변경
//@NoArgsConstructor// 기본 생성자 생성 애너테이션
//@AllArgsConstructor
@RequiredArgsConstructor
public class Memo {
    private final String username;
    private String content;
    private String description;
    private final String password;

}

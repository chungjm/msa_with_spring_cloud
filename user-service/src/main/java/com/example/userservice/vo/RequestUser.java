package com.example.userservice.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RequestUser {

    @NotNull(message = "아이디 항목은 필수 입력값입니다.")
    @Size(min = 2, message = "이메일은 최소 두 글자 이상입니다.")
    private String email;

    @NotNull(message = "이름 항목은 필수 입력값입니다.")
    @Size(min = 2, message = "이름은 최소 두 글자 이상입니다.")
    private String name;

    @NotNull(message = "패스워드 항목은 필수 입력값입니다.")
    @Size(min = 8, message = "비밀번호는 최소 8 글자 이상입니다.")
    private String pwd;
}

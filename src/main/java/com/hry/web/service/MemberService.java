package com.hry.web.service;

public interface MemberService {
    int login (String username,String password);

    int change(Long member,String password);
}

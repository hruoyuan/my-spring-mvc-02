package com.hry.web.controller;


import com.hry.web.common.result.ResponseResult;
import com.hry.web.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Resource
    private MemberService memberService;

    @PostMapping("/login")
    public ResponseResult<Integer> login(String username, String password){
        return ResponseResult.success(memberService.login(username,password));
    }
}

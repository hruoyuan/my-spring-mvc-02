package com.hry.web.service.impl;

import com.hry.web.common.ex.MemberException;
import com.hry.web.common.ex.ServiceException;
import com.hry.web.common.result.ResponseCode;
import com.hry.web.entity.Member;
import com.hry.web.mapper.MemberMapper;
import com.hry.web.service.MemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class MemberServiceImpl implements MemberService {

    @Resource
    private MemberMapper memberMapper;

    @Override
    public int login(String username, String password) {
        Member member = memberMapper.selectByName(username);
        if (member != null) {
            if (member.getPassword().equals(password)) {
                // 登录成功的业务逻辑
                return 1;
            } else {
                throw new ServiceException(ResponseCode.MEMBER_NO_EXIST_ERROR);
            }
        } else {
            throw new ServiceException(ResponseCode.MEMBER_NO_EXIST_ERROR) ;
        }
    }

    @Override
    public int change(Long member, String password) {
        return 0;
    }
}

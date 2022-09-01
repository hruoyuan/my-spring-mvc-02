package com.hry.web.mapper;

import com.hry.web.entity.Member;
import org.apache.ibatis.annotations.Param;

public interface MemberMapper {

    Member selectByName(@Param("username") String username);

    Member selectByPrimaryKey(@Param("memberId") Long  memberId);
}

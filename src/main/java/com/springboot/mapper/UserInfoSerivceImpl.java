package com.springboot.mapper;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springboot.entity.Unwind;
import org.springframework.stereotype.Service;

@Service
public class UserInfoSerivceImpl extends ServiceImpl<UserMapper, Unwind> implements UserInfoService{
}

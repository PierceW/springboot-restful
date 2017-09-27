package com.alex.restful.service.impl;

import com.alex.restful.mapper.SysUserMapper;
import com.alex.restful.pojo.SysUser;
import com.alex.restful.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser getSysUserById(Long id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }
}

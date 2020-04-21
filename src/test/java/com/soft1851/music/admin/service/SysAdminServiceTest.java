package com.soft1851.music.admin.service;

import com.soft1851.music.admin.dto.LoginDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SysAdminServiceTest {
    @Resource
    private SysAdminService sysAdminService;

    @Test
    void login() {
        LoginDto loginDto = LoginDto.builder().name("taoranrn").password("12346").build();
        assertTrue(sysAdminService.login(loginDto));
    }

    @Test
    void getAdmin() {
        System.out.println(sysAdminService.getAdmin("taoranran"));
    }
}
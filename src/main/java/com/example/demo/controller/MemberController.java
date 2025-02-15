package com.example.demo.controller;

import com.example.demo.dto.responseDto.ResponseDto;
import com.example.demo.security.jwt.JwtTokenProvider;
import com.example.demo.service.KakaoLoginService;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.json.ParseException;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final KakaoLoginService kakaoLoginService;
    private final JwtTokenProvider jwtTokenProvider;
    @GetMapping(value = "/login/kakao")
    public ResponseDto<?> login(@RequestParam String code, HttpServletResponse httpServletResponse) throws IOException, ParseException {

        //E001: https로 로그인시 오류
        return kakaoLoginService.kakaoLogin(code,httpServletResponse);
    }



}

package com.example.intermediate.controller;

import com.example.intermediate.controller.request.HeartRequestDto;
import com.example.intermediate.controller.response.ResponseDto;
import com.example.intermediate.service.PostHeartService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Validated
@RequiredArgsConstructor
@RestController
public class HeartController {

    private final PostHeartService postHeartService;
    //private final PostCommentHeartService postCommentHeartService;

    @RequestMapping(value = "/api/auth/post/{id}", method = RequestMethod.POST)
    public ResponseDto<?> createPostHeart(@RequestBody HeartRequestDto requestDto,
                                          HttpServletRequest request) {
        return postHeartService.createPostHeart(requestDto, request);
    }
//    @RequestMapping(value = "/api/auth/postComment/heart", method = RequestMethod.POST)
//    public ResponseDto<?> createPostCommentHeart(@RequestBody HeartRequestDto requestDto,
//                                                 HttpServletRequest request) {
//        return postCommentHeartService.createPostCommentHeart(requestDto, request);
//    }

}
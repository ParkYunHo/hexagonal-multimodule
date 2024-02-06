package com.yoonho.newalliance.api.mymusic

import com.yoonho.application.usecase.mymusic.FindUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MymusicController(
    private val findUseCase: FindUseCase
) {

    @GetMapping("/profile")
    fun profile(memberKey: Int): String =
        findUseCase.findMyProfile(memberKey = memberKey)
}
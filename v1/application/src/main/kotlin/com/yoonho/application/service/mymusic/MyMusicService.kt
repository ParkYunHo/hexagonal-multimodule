package com.yoonho.application.service.mymusic

import com.yoonho.application.port.FindPort
import com.yoonho.application.usecase.mymusic.FindUseCase
import org.springframework.stereotype.Service

@Service
class MyMusicService(
    private val findPort: FindPort
): FindUseCase {

    override fun findMyProfile(memberKey: Int): String {
        TODO("Not yet implemented")
    }
}
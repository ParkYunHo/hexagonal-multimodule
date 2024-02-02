package com.yoonho.application.port

interface FindPort {
    fun findMyProfile(memberKey: Int): String
}
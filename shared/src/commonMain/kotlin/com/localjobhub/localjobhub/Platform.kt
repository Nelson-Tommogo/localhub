package com.localjobhub.localjobhub

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
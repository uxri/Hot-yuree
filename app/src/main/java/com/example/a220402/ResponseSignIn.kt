package com.example.a220402

data class ResponseSignIn(
    val status: Int,
    val message: String,
    val data: Data
) {
    data class Data(
        val email: String,
        val name: String
    )
}
package com.example.a220402.api

import com.example.a220402.response.ResponseUserInfo
import retrofit2.Call
import retrofit2.http.GET

interface GithubApiService{
    @GET("users/uxri")
    fun getUserInfo(): Call<ResponseUserInfo>

    @GET("users/uxri/followers")
    fun getFollowingInfo(): Call<List<ResponseUserInfo>>
}
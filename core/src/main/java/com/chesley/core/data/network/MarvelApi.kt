package com.chesley.core.data.network

import com.chesley.core.data.network.response.DataWrapperResponse
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface MarvelApi {

    @GET("characters")
    suspend fun funCharacters(
        @QueryMap
        queries: Map<String, String>
    ):DataWrapperResponse
}
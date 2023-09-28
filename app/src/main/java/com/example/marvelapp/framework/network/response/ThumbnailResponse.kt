package com.example.marvelapp.framework.network.response

import com.google.gson.annotations.SerializedName

data class ThumbnailResponse(
    val path: String,
    @SerializedName("extension")//Quando quiser mudar o nome diferente do que esta na API usa essa anotação.
    val extensionPah: String,
)

package com.example.simulator.domain

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Team(
    //Data CLass já tem os gets e sets implícitos
    @SerializedName("nome")
    val name: String,
    @SerializedName("forca")
    val stars: Int,
    @SerializedName("imagem")
    val image: String,
    var score: Int?
) : Parcelable
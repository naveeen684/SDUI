package com.example.sdui1.data


import com.google.gson.annotations.SerializedName

data class ChildXXXXXXXX(
    val child: List<ChildXXXXXXXXX>,
    val clickable: String,
    val component: String,
    val height: Int,
    val name: String,
    val padding: Int,
    val width: Int
)
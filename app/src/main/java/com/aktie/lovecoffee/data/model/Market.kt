package com.aktie.lovecoffee.data.model

data class Market(
    val id: String,
    val categoryId: String,
    val name: String,
    val description: String,
    val coupon: Int,
    val rules: List<Rule> = emptyList(),
    val latitude: Double,
    val longitude: Double,
    val address: String,
    val phone: String,
    val cover: String
)
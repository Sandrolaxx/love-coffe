package com.aktie.lovecoffee.data.model

import androidx.annotation.DrawableRes

data class Category(
    val id: String,
    val name: String
) {
    @get:DrawableRes
    val icon: Int?
        get() = CategoryFilterChipEnum.fromDescription(description = name)?.icon
}

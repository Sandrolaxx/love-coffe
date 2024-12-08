package com.aktie.lovecoffe.data.model

import androidx.annotation.DrawableRes

data class LvCoffeCategory(
    val id: String,
    val name: String
) {
    @get:DrawableRes
    val icon: Int?
    get() = LvCoffeCategoryFilterChipEnum.fromDescription(description = name)?.icon
}

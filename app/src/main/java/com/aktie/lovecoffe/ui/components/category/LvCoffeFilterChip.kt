package com.aktie.lovecoffe.ui.components.category

import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FilterChip
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.aktie.lovecoffe.data.model.LvCoffeCategory
import com.aktie.lovecoffe.ui.theme.Gray400
import com.aktie.lovecoffe.ui.theme.Typography

@Composable
fun LvCoffeCategoryFilterChip(
    modifier: Modifier = Modifier,
    isSelected: Boolean,
    onClick: (isSelected: Boolean) -> Unit,
    category: LvCoffeCategory
) {
    FilterChip(
        modifier = modifier
            .padding(2.dp)
            .heightIn(min = 36.dp),
        selected = isSelected,
        elevation = Chip
        onClick = { onClick(isSelected) },
        label = {
            Text(
                text = category.name,
                style = Typography.body2,
                color = if (isSelected) Color.White else Gray400
            )
        }
    )
}
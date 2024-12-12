package com.aktie.lovecoffee.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aktie.lovecoffee.R
import com.aktie.lovecoffee.ui.theme.Gray100
import com.aktie.lovecoffee.ui.theme.GreenBase
import com.aktie.lovecoffee.ui.theme.Typography

@Composable
fun LvCoffeeButton(
    modifier: Modifier = Modifier,
    text: String? = null,
    @DrawableRes iconRes: Int? = null,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier.heightIn(min = 56.dp),
        shape = RoundedCornerShape(16.dp),
        contentPadding = if (text == null && iconRes != null) PaddingValues(0.dp) else ButtonDefaults.ContentPadding,
        colors = ButtonDefaults.buttonColors(
            containerColor = GreenBase,
            contentColor = Gray100
        ),
        onClick = onClick
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            iconRes?.let {
                Icon(
                    painter = painterResource(id = iconRes.hashCode()),
                    contentDescription = "Ícone do botão"
                )
            }
            text?.let { Text(text = text.uppercase(), style = Typography.labelMedium) }
        }

    }
}

@Preview
@Composable
private fun LvCoffeeButtonPreview() {
    LvCoffeeButton(
        modifier = Modifier.fillMaxWidth(),
        text = "Confirmar",
        iconRes = R.drawable.ic_scan
    ) {}
}

@Preview
@Composable
private fun LvCoffeeButtonNoIconPreview() {
    LvCoffeeButton(
        modifier = Modifier.fillMaxWidth(),
        text = "Confirmar"
    ) {}
}

@Preview
@Composable
private fun LvCoffeeButtonNoTextPreview() {
    LvCoffeeButton(
        modifier = Modifier,
        iconRes = R.drawable.ic_arrow_left
    ) {}
}
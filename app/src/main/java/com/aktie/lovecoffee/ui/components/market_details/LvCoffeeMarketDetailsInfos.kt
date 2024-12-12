package com.aktie.lovecoffee.ui.components.market_details

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aktie.lovecoffee.data.model.Market
import com.aktie.lovecoffee.ui.theme.Gray400
import com.aktie.lovecoffee.ui.theme.Typography
import com.aktie.lovecoffee.R
import com.aktie.lovecoffee.data.model.mock.marketsMock
import com.aktie.lovecoffee.ui.theme.Gray100
import com.aktie.lovecoffee.ui.theme.Gray500

@Composable
fun LvCoffeeMarketDetailsInfos(modifier: Modifier = Modifier, market: Market) {
    Column (
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(text = "Informações", style = Typography.headlineSmall, color = Gray400)

        Column (
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Row (
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Icon(
                    modifier = Modifier.size(16.dp),
                    painter = painterResource(id = R.drawable.ic_ticket),
                    tint = Gray100,
                    contentDescription = "Ícone cupons"
                )
                Text(
                    text = "${market.coupon} cupons disponíveis",
                    style = Typography.labelMedium,
                    color = Gray500
                )
            }

            Row (
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Icon(
                    modifier = Modifier.size(16.dp),
                    painter = painterResource(id = R.drawable.ic_map_pin),
                    tint = Gray100,
                    contentDescription = "Ícone mapa"
                )
                Text(
                    text = market.address,
                    style = Typography.labelMedium,
                    color = Gray500
                )
            }

            Row (
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Icon(
                    modifier = Modifier.size(16.dp),
                    painter = painterResource(id = R.drawable.ic_phone),
                    tint = Gray100,
                    contentDescription = "Ícone contato"
                )
                Text(
                    text = market.phone,
                    style = Typography.labelMedium,
                    color = Gray500
                )
            }
        }
    }
}

@Preview
@Composable
private fun LvCoffeeMarketDetailsInfosPreview() {
    LvCoffeeMarketDetailsInfos(
        modifier = Modifier.fillMaxWidth(),
        market = marketsMock.first()
    )
}
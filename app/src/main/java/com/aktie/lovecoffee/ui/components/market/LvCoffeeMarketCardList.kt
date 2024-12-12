package com.aktie.lovecoffee.ui.components.market

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aktie.lovecoffee.data.model.Market
import com.aktie.lovecoffee.data.model.mock.marketsMock
import com.aktie.lovecoffee.ui.theme.Typography

@Composable
fun LvCoffeeMarketCardList(
    modifier: Modifier = Modifier,
    markets: List<Market>,
    onMarketClick: (Market) -> Unit
) {
    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Text(text = "Explore locais perto de você", style = Typography.bodyLarge)
        }
        items(items = markets, key = { it.id }) { market ->
            LvCoffeeMarketCard(market = market, onClick = {
                onMarketClick(market)
            })
        }
    }
}

@Preview
@Composable
private fun LvCoffeeMarketCardListPreview() {
    LvCoffeeMarketCardList(
        markets = marketsMock,
        onMarketClick = {}
    )
}
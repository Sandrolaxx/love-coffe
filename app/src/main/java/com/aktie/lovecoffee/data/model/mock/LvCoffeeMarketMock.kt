package com.aktie.lovecoffee.data.model.mock

import com.aktie.lovecoffee.data.model.Market

val marketsMock = listOf(
    Market(
        id = "123123213123",
        categoryId = "34234234234234",
        name = "Café++",
        coupon = 10,
        rules = emptyList(),
        latitude = -23.44433232323,
        longitude = -46.44433232323,
        address = "Rua elias abraão - Paulo Godoy",
        phone = "45 991351089",
        description = "Local simples e rápido! Chega de enrolação, pega o café e tchau",
        cover = "https://coffeetown.com.br/wp-content/uploads/2024/04/CT-MACEIO_IMG-02.jpg"
    ),
    Market(
        id = "12312324343",
        categoryId = "54234234234234",
        name = "Café - Só um pingado",
        coupon = 10,
        rules = emptyList(),
        latitude = -23.44433232323,
        longitude = -46.44433232323,
        address = "Rua barão do cerro azul - Centro",
        phone = "45 991351089",
        description = "Um local muito show!",
        cover = "https://coffeetown.com.br/wp-content/uploads/2024/04/CT-MACEIO_IMG-02.jpg"
    )
)
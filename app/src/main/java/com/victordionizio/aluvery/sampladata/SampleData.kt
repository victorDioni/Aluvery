package com.victordionizio.aluvery.sampladata

import com.victordionizio.aluvery.R
import com.victordionizio.aluvery.model.Product
import java.math.BigDecimal

// amostra de dados - Apenas utilizados para exivição em preview e nao no app
val sampleProducts = listOf(

    Product(
        name = "Hambuguer",
        price = BigDecimal("14.99"),
        image = R.drawable.burger
    ),
    Product(
        name = "Pizza",
        price = BigDecimal("20.00"),
        image = R.drawable.pizza
    ),
    Product(
        name = "Fries",
        price = BigDecimal("7.99"),
        image = R.drawable.fries
    )

)

val sampleProductsCandy = listOf(

    Product(
        name = "Chocolate",
        price = BigDecimal("8.20"),
        image = R.drawable.chocolate
    ),
    Product(
        name = "Brigadeiro",
        price = BigDecimal("3.00"),
        image = R.drawable.brigadeiro
    ),
    Product(
        name = "Beijinho",
        price = BigDecimal("3.00"),
        image = R.drawable.beijinho
    ),
    Product(
        name = "Carolina",
        price = BigDecimal("7.99"),
        image = R.drawable.carolina
    ),
    Product(
        name = "Batata doce",
        price = BigDecimal("2.50"),
        image = R.drawable.doce_batata
    )

)

val sampleProductsDrink = listOf(

    Product(
        name = "Água",
        price = BigDecimal("3.00"),
        image = R.drawable.agua
    ),
    Product(
        name = "Refrigerantes",
        price = BigDecimal("5.00"),
        image = R.drawable.refri
    )
)
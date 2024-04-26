package com.victordionizio.aluvery.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.victordionizio.aluvery.sampladata.sampleProducts
import com.victordionizio.aluvery.sampladata.sampleProductsCandy
import com.victordionizio.aluvery.sampladata.sampleProductsDrink
import com.victordionizio.aluvery.ui.components.ProductSection


@Composable
fun HomeScreen(){
    Column(
        modifier =
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        ProductSection("Promoções", sampleProducts)
        ProductSection("Doces", sampleProductsCandy)
        ProductSection("Bebidas", sampleProductsDrink)
    }
}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
package com.victordionizio.aluvery.ui.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.victordionizio.aluvery.R
import com.victordionizio.aluvery.model.Product
import com.victordionizio.aluvery.sampladata.sampleProducts
import java.math.BigDecimal

@Composable
fun ProductSection(
    title: String,
    products: List<Product>
) {
    Column {
        Text(
            text = title,
            modifier = Modifier.padding(
                start = 16.dp,
                end = 16.dp
            ),
            fontSize = 20.sp,
            fontWeight = FontWeight(400)
        )
        Row(
            modifier = Modifier
                .padding(
                    top = 8.dp,
                )
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            for (p in products) {
                ProductItem(product = p)
            }
        }


    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun ProductSectionPreview() {
    ProductSection("Promoções", products = sampleProducts)

}


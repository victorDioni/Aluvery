package com.victordionizio.aluvery.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.victordionizio.aluvery.model.Product
import com.victordionizio.aluvery.sampladata.sampleProducts
import com.victordionizio.aluvery.ui.components.ProductItem
import com.victordionizio.aluvery.ui.components.ProductSection
import com.victordionizio.aluvery.ui.theme.AluveryTheme

@Composable
fun AllProducts(products: List<Product>) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(16.dp)

    )
    {
        item(span = {
            GridItemSpan(maxLineSpan)
        }) {
            Text(text = "Todos produtos", fontSize = 32.sp)
        }
        items(products) { p ->
            ProductItem(product = p)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun AllProductsPreview() {
    AluveryTheme {
        Surface {
            AllProducts(sampleProducts)
        }
    }
}
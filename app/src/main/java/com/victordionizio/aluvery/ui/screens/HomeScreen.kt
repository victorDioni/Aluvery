package com.victordionizio.aluvery.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.victordionizio.aluvery.model.Product
import com.victordionizio.aluvery.sampladata.sampleProducts
import com.victordionizio.aluvery.sampladata.sampleSections
import com.victordionizio.aluvery.ui.components.CardProductItem
import com.victordionizio.aluvery.ui.components.ProductSection
import com.victordionizio.aluvery.ui.theme.AluveryTheme


@Composable
fun HomeScreen(
    sections: Map<String, List<Product>>,
    searchText : String = ""
) {
    Column {
        var text by remember { mutableStateOf(searchText) }
        // Expressao lambda
        OutlinedTextField(
            value = text,
            onValueChange = { newValue ->
                text = newValue
            },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(100),
            leadingIcon = {
                Icon(imageVector = Icons.Default.Search, contentDescription = "Icone de busca")
            },
            label = {
                Text(text = "Produto")
            },
            placeholder = {
                Text(text = "O que você procura?g")
            }
        )
        LazyColumn(
            modifier =
            Modifier
                .fillMaxSize(),
            contentPadding = PaddingValues(4.dp)
        ) {
            if (text.isBlank()) {
                //Apresentar secao com os produtos
                for (section in sections) {
                    val title = section.key
                    val products = section.value
                    item {
                        ProductSection(
                            title = title,
                            products = products
                        )
                    }
                }
            } else {
                //Apresenta lista de produtos
                items(sampleProducts) { p ->
                    CardProductItem(
                        product = p,
                        Modifier.padding(16.dp)
                    )
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    AluveryTheme {
        Surface {
            HomeScreen(sampleSections)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenWithSearchTextPreview() {
    AluveryTheme {
        Surface {
            HomeScreen(sampleSections, searchText = "a")
        }
    }
}
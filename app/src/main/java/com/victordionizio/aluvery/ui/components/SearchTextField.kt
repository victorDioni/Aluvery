package com.victordionizio.aluvery.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.victordionizio.aluvery.ui.theme.AluveryTheme

@Composable
fun SearchTextField(
    searchText: String,
    onSearchChange : (String) -> Unit,
    modifier: Modifier = Modifier
){
    // Expressao lambda
    OutlinedTextField(
        value = searchText,
        onValueChange = { newValue ->
            onSearchChange(newValue)
        },
        modifier
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
            Text(text = "O que você procura?")
        }
    )
}

@Preview(showBackground = true)
@Composable
fun SearchTextFieldPreview() {
    AluveryTheme {
        Surface {
            SearchTextField(
                "",
                onSearchChange = {},
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SearchTextFieldWithSearchTextPreview() {
    AluveryTheme {
        Surface {
            SearchTextField(
                searchText = "a",
                onSearchChange = {},
            )
        }
    }
}
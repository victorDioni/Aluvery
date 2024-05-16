package com.victordionizio.aluvery.ui.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.victordionizio.aluvery.ui.theme.AluveryTheme

class ProductFormActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            AluveryTheme {
                Surface {
                    ProductFormScren()
                }
            }
        }
    }
}

@Composable
fun ProductFormScren(){
    Column {
        Text(text = "Criando o produto")
        var url by remember {
            mutableStateOf("")
        }
        TextField(value = url, onValueChange = {
            url = it
        })

        var name by remember {
            mutableStateOf("")
        }
        TextField(value = name, onValueChange = {
            name = it
        })

        var price  by remember {
            mutableStateOf("")
        }
        TextField(value = price , onValueChange = {
            price  = it
        })

        var description  by remember {
            mutableStateOf("")
        }
        TextField(value = description , onValueChange = {
            description  = it
        })

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Salvar")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProductFormScrenPreview(){
    AluveryTheme {
        Surface {
            ProductFormScren()
        }
    }
}
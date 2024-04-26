package com.victordionizio.aluvery.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.victordionizio.aluvery.ui.theme.AluveryTheme

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CustomLayoutPreview() {
    Column(
        modifier = Modifier
            .padding(all = 8.dp)
            .background(color = Color.Blue)
            .fillMaxWidth()
            .fillMaxHeight()) {
        Text(text = "Texto 1")
        Text(text = "Texto 2")
        Row (
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 16.dp)
                .background(color = Color.Green)
                .fillMaxWidth(0.1f)
        ){
            Text(text = "Texto 3")
            Text(text = "Texto 4")
        }
        Box (
            modifier = Modifier
                .padding(all = 8.dp)
                .background(color = Color.Red)
        ){
            Row(
                modifier = Modifier
                    .padding(all = 8.dp)
                    .background(color = Color.Cyan)
            ) {
                Text(text = "Texto 5")
                Text(text = "Texto 6")
            }
            Column (
                modifier = Modifier
                    .padding(all = 8.dp)
                    .background(color = Color.Yellow)
            ){
                Text(text = "Texto 7")
                Text(text = "Texto 8")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ColumnPreview() {
    Column {
        Text(text = "Texto 1")
        Text(text = "Texto 2")
    }
}

@Preview(showBackground = true)
@Composable
fun RowPreview() {
    Row {
        Text(text = "Texto 1")
        Text(text = "Texto 2")
    }
}

@Preview(showBackground = true)
@Composable
fun BoxPreview() {
    Box {
        Text(text = "Texto 1")
        Text(text = "Texto 2")
    }
}

@Composable
fun MyFirstComposable(){
    Text(text = "Meu primeiro texto")
    Text(text = "My first Composable More")
}

@Preview(
    name = "NewTextPreview",
    uiMode = Configuration.UI_MODE_NIGHT_YES
)

@Preview(
    name = "NewTextPreviewLight",
)

@Preview(
    name = "Text Preview",
    heightDp = 200,
    widthDp = 300,
    showBackground = true,
    backgroundColor = 0xFFF1144
)
@Composable
fun MyFistComposablePreview(){
    AluveryTheme {
        Surface {
            MyFirstComposable()
        }
    }
}
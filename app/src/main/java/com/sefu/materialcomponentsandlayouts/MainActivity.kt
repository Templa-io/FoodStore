package com.sefu.materialcomponentsandlayouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sefu.materialcomponentsandlayouts.ui.theme.MaterialComponentsANdLayoutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialComponentsANdLayoutsTheme {

            }
        }


    }
}

@Composable
fun TopBar(modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier
            .padding(top = 24.dp, start = 16.dp, end = 16.dp, bottom = 16.dp)
            .fillMaxWidth()
    ) {
        Column() {
            Text(text = "Discover", fontWeight = FontWeight.Bold, fontSize = 28.sp)
            Text(text = "new tasting experience", color = Color.Gray)
        }
        Box(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(12.dp))
                .size(60.dp)
                .background(color = Color.Red),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .align(alignment = Alignment.Center),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Icon(Icons.Rounded.Settings, contentDescription = "filter", tint = Color.White)
                Text(
                    text = "Filter",
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(color = Color.White)
                )
            }
        }
    }
}

@Composable
fun SearchButton(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .clip(shape = RoundedCornerShape(6.dp))
            .border(width = 2.dp, color = Color.Gray, shape = RoundedCornerShape(6.dp))
            .fillMaxWidth()
            .height(60.dp)
            .background(color = Color.White)
    ) {
        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Icon(
                Icons.Rounded.Search,
                contentDescription = "Search",
                tint = Color.Gray.copy(alpha = 0.4F),
                modifier = Modifier.padding(start = 8.dp)
            )
            TextField(
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.textFieldColors(
                    textColor = Color.Transparent,
                    disabledTextColor = Color.Transparent,
                    backgroundColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent
                ),
                value = "", onValueChange = {}, placeholder = {
                    Text(
                        text = "Find a better Restaurant", style = TextStyle(color = Color.Gray)
                    )
                })
        }
    }
}

@Preview
@Composable
fun SearchBarPreview() {
    MaterialComponentsANdLayoutsTheme {
        SearchButton()
    }

}

@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    MaterialComponentsANdLayoutsTheme {
        TopBar()
    }
}

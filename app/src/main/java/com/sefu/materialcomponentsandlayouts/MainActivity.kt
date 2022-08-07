package com.sefu.materialcomponentsandlayouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sefu.materialcomponentsandlayouts.ui.theme.MaterialComponentsANdLayoutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialComponentsANdLayoutsTheme {
                MainScreen()

            }
        }


    }
}

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(24.dp),
        modifier = modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.light_white))
            .padding(24.dp)
    ) {
        TopBar()
        SearchButton()
        TextContent()
        Product()
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
            Text(
                text = "Discover",
                fontWeight = FontWeight.Bold,
                fontSize = 34.sp,modifier=Modifier.clickable {  },
                style = TextStyle(
                    color = colorResource(
                        id = R.color.gray_two
                    )
                )
            )
            Text(text = "new tasting experience", color = Color.Gray)
        }
        Box(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(12.dp))
                .size(60.dp)
                .background(color = colorResource(id = R.color.orange)),
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
            .border(width = 1.dp, color = Color.Gray, shape = RoundedCornerShape(6.dp))
            .fillMaxWidth()
            .height(50.dp)
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

@Composable
fun TextContent(modifier: Modifier = Modifier) {
    Text(text = "Trending Restaurant", fontWeight = FontWeight.Bold, textAlign = TextAlign.Start)
}

@Composable
fun Product(modifier: Modifier = Modifier) {

    Box(
        modifier = modifier
            .clip(
                shape = RoundedCornerShape(
                    topStart = 16.dp,
                    bottomStart = 16.dp,
                    bottomEnd = 16.dp
                )
            )
            .background(color = Color.White)
            .size(width = 200.dp, height = 400.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                modifier = modifier.size(300.dp),
                painter = painterResource(id = R.drawable.bugger),
                contentDescription = "Bugger"
            )


            Box(
                modifier = modifier
                    .clip(
                        shape = RoundedCornerShape(
                            topStart = 16.dp,
                            bottomStart = 16.dp,
                            bottomEnd = 16.dp
                        )
                    )
                    .background(color = colorResource(id = R.color.light_orange))
                    .height(100.dp)
                    .padding(12.dp)

            ) {
                Column(
                    horizontalAlignment = Alignment.Start,
                    modifier = modifier.fillMaxWidth()
                ) {
                    Text(text = "Cafe Raybin Wolf", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            Icons.Rounded.LocationOn,
                            modifier = modifier.size(12.dp),
                            tint = Color.Gray,
                            contentDescription = "Location"
                        )
                        Text(text = "Portugal Street View", fontSize = 12.sp, color = Color.Gray)
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Icon(
                            Icons.Rounded.Star,
                            modifier = modifier.size(12.dp),
                            tint = colorResource(id = R.color.orange),
                            contentDescription = ""
                        )
                        Icon(
                            Icons.Rounded.Star,
                            modifier = modifier.size(12.dp),
                            tint = colorResource(id = R.color.orange),
                            contentDescription = ""
                        )
                        Icon(
                            Icons.Rounded.Star,
                            modifier = modifier.size(12.dp),
                            tint = colorResource(id = R.color.orange),
                            contentDescription = ""
                        )
                        Icon(
                            Icons.Rounded.Star,
                            modifier = modifier.size(12.dp),
                            tint = colorResource(id = R.color.orange),
                            contentDescription = ""
                        )
                        Icon(
                            Icons.Rounded.Star,
                            modifier = modifier.size(12.dp),
                            tint = colorResource(id = R.color.orange),
                            contentDescription = ""
                        )
                        Icon(
                            Icons.Rounded.Star,
                            modifier = modifier.size(12.dp),
                            tint = colorResource(id = R.color.gray_one),
                            contentDescription = ""
                        )
                        Spacer(modifier = modifier.width(80.dp))

                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = modifier
                                .clip(shape = RoundedCornerShape(12.dp))
                                .size(24.dp)
                                .background(color = Color.White)
                        ) {
                            Icon(
                                Icons.Rounded.ArrowForward,
                                contentDescription = "arrow",
                                Modifier
                                    .size(16.dp)
                                    .wrapContentSize(align = Alignment.Center)
                                    .clip(shape = RoundedCornerShape(12.dp)),
                                tint = colorResource(id = R.color.orange)
                            )
                        }

                    }
                }
            }
        }
    }
}


@Preview
@Composable
fun MainScreenPreview() {
    MaterialComponentsANdLayoutsTheme {
        MainScreen()
    }
}

@Preview(showBackground = true)
@Composable
fun ProductPreview() {
    MaterialComponentsANdLayoutsTheme {
        Product()
    }
}

@Preview(showBackground = true)
@Composable
fun TextPreview() {
    MaterialComponentsANdLayoutsTheme {
        TextContent()
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

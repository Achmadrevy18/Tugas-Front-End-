package com.example.frontend

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.frontend.ui.theme.FrontEndTheme

// Data class to represent each food item
data class Food(val name: String, val imageRes: Int)

@Composable
fun Screen2() {
    val foodItems = listOf(
        Food("Kue Putu",R.drawable.kueputu),
        Food("Selendang Mayang",R.drawable.selendangmayang),
        Food("Sayur Asem",R.drawable.aseemm),
        Food("Semur Jengkol",R.drawable.jengkol),
        Food("Nasi Uduk",R.drawable.nasiuduk),
        Food("Kerak Telor",R.drawable.keraktelor),
        Food("Soto Betawi",R.drawable.sotobetawi),
        Food("Gado Gado",R.drawable.gadogado),
        Food("Kue Leker",R.drawable.kuelekker),
        Food("Kue Putu",R.drawable.kueputu),


    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF008080))
            .padding(16.dp)
    ) {

        IconButton(
            onClick = {},
            modifier = Modifier.align(Alignment.Start)
        ) {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.baseline_arrow_back_ios_24),
                contentDescription = "Back",
                tint = Color.White
            )
        }

        Spacer(modifier = Modifier.height(8.dp))


        Text(
            text = "Makanan Betawi Punya",
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier.padding(bottom = 25.dp,)
        )


        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(foodItems) { food ->
                ListMenu(food.imageRes, food.name)
            }
        }
    }
}

@Composable
fun ListMenu(imageRes: Int, title: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .width(100.dp)
            .background(Color.White, RoundedCornerShape(8.dp))
            .padding(8.dp)
    ) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = title,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(80.dp)
                .padding(4.dp)
        )
        Text(
            text = title,
            fontSize = 12.sp,
            color = Color.Black
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Screen2Priview() {
    FrontEndTheme {
        Screen2()
    }
}

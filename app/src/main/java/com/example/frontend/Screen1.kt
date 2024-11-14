package com.example.frontend

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.frontend.ui.theme.FrontEndTheme

@Composable
fun Screen1() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF008080))
            .padding(16.dp)
    ) {
        Spacer(modifier = Modifier.height(95.dp))
        Text(
            text = "Hi, Selamat Datang",
            color = Color.White,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold

        )

        Spacer(modifier = Modifier.height(16.dp))


        Text(
            text = "Jajanan Khas Betawi",
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold
        )

        Spacer(modifier = Modifier.height(8.dp))

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            item { FoodItem("Kerak Telor", R.drawable.keraktelor) }
            item { FoodItem("Kue Leker", R.drawable.kuelekker) }
            item { FoodItem("Kue Putu", R.drawable.kueputu) }
            item { FoodItem("Akar Kelapa", R.drawable.akarkelapa) }
            item { FoodItem("Kue Dongkal", R.drawable.dongkal) }
            item { FoodItem("Kue Pancong", R.drawable.pancong) }
            item { FoodItem("Kembang Goyang", R.drawable.kembanggoyang) }
            item { FoodItem("Kue Rengginang", R.drawable.rengginang) }
            item { FoodItem("Tape Uli", R.drawable.uli) }
            item { FoodItem("Dodol Betawi", R.drawable.dodol) }
        }

        Spacer(modifier = Modifier.height(16.dp))


        Text(
            text = "Masakan Betawi",
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold
        )

        Spacer(modifier = Modifier.height(8.dp))

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            item { DishItem("Nasi Uduk Betawi", R.drawable.nasiuduk) }
            item { DishItem("Soto Betawi", R.drawable.sotobetawi) }
            item { DishItem("Gado Gado", R.drawable.gadogado) }
            item { DishItem("Sayur Asem", R.drawable.aseemm) }
            item { DishItem("Semur Jengkol", R.drawable.jengkol) }
            item { DishItem("Sayur Lodeh", R.drawable.lodeh) }
            item { DishItem("Sayur Bekasem", R.drawable.bekasem) }
            item { DishItem("Nasi Ulam", R.drawable.ulam) }
            item { DishItem("Pindang Bandeng", R.drawable.bandeng) }
            item { DishItem("Gabus Pucung", R.drawable.gabus) }
        }
    }
}

@Composable
fun FoodItem(name: String, imageRes: Int) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .width(80.dp)
            .background(Color.White, shape = RoundedCornerShape(8.dp))
            .padding(8.dp)
    ) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = name,
            modifier = Modifier.size(64.dp)
        )
        Text(text = name, fontSize = 12.sp)
    }
}

@Composable
fun DishItem(name: String, imageRes: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White, shape = RoundedCornerShape(8.dp))
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = name,
            modifier = Modifier.size(64.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = name, fontSize = 16.sp, fontWeight = FontWeight.Bold)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Screen1Preview() {
    FrontEndTheme {
        Screen1()
    }
}

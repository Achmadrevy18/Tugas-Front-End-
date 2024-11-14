package com.example.frontend

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.colorResource

@Composable
fun DetailScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF008080))
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Detail",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier
                .padding(bottom = 8.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Left
        )


        Text(
            text = "Kerak Telor",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier
                .padding(vertical = 8.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Left
        )


        Image(
            painter = painterResource(id = R.drawable.keraktelor),
            contentDescription = "Kerak Telor",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))


        Text(
            text = "Kerak Telor adalah makanan asli daerah Jakarta (Betawi) dengan bahan-bahan beras ketan putih, telur ayam atau bebek, ebi (udang kering yang diasinkan), ditambah bawang merah goreng, lalu diberi bumbu yang dihaluskan berupa kelapa sangrai, cabai merah, kencur, jahe, kunyit, serai halus, merica butiran, garam dan gula pasir. Kerak telor dapat ditemukan pada hari biasa. Anda bisa menemukan kerak telor di sekitar kota tua, Jakarta Barat. Menurut sejarah, Kerak Telor sudah ada dari zaman kolonial Belanda dan secara tidak sengaja dibuat pada tahun 1920-an. Makanan ini cukup digemari oleh banyak sekali masyarakat Betawi.",
            fontSize = 14.sp,
            color = Color.White,
            lineHeight = 20.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(vertical = 8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DetailScreenPreview() {
    DetailScreen()
}

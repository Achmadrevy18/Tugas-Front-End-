package com.example.frontend

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.frontend.ui.theme.FrontEndTheme

@Composable
fun Screen3() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF008080))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Header
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "About Me",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(16.dp))


        Image(
            painter = painterResource(id = R.drawable.apoy),
            contentDescription = "Profile Picture",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .padding(3.dp)
                .background(Color(0xFF008080), shape = CircleShape)
        )

        Spacer(modifier = Modifier.height(16.dp))


        Text(
            text = "Achmad Revy S",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(16.dp))


        ProfileInfoItem(label = "Alamat Email :", value = "Achmadrevy123@gmail.com")
        ProfileInfoItem(label = "Asal Perguruan Tinggi :", value = "Universitas Krisnadwipayana")
        ProfileInfoItem(label = "Jurusan :", value = "Teknik Informatika")
    }
}

@Composable
fun ProfileInfoItem(label: String, value: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White, shape = RoundedCornerShape(8.dp))
            .padding(16.dp)
            .padding(vertical = 8.dp)
            .padding(horizontal = 16.dp)
    ) {
        Column {
            Text(text = label, fontSize = 14.sp, fontWeight = FontWeight.SemiBold, color = Color.Gray)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = value, fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.Black)
        }
    }
    Spacer(modifier = Modifier.height(8.dp))
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Screen3Preview() {
    FrontEndTheme {
        Screen3()
    }
}

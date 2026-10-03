package com.example.prak2arlys.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prak2arlys.R

@Composable
fun Tugas() {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        // Lapisan paling bawah: gambar latar layar penuh
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = "Background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        // Lapisan atas: semua konten disusun vertikal
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 40.dp, bottom = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Login",
                color = Color.Blue,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Ini adalah halaman login,",
                color = Color.White,
                fontSize = 16.sp
            )

            Spacer(modifier = Modifier.height(50.dp))

            // Logo kampus
            Image(
                painter = painterResource(id = R.drawable.img_1),
                contentDescription = "Logo",
                modifier = Modifier.size(150.dp)
            )

            Spacer(modifier = Modifier.height(50.dp))

            Text(
                text = "Nama",
                color = Color.Red,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "FAIZ RIZKY KURNIAWAN",
                color = Color.Blue,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "20240140012",
                color = Color.Black,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

package com.example.prak2arlys

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Halaman utama: menampilkan semua latihan dari atas ke bawah
@Composable
fun TataLetak() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .statusBarsPadding()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        Judul("1. Column")
        LatihanColumn()

        Judul("2. Row")
        LatihanRow()

        Judul("3. Box")
        LatihanBox()

        Judul("4. Column + Row")
        LatihanColumnRow()

        Judul("5. Row + Column")
        LatihanRowColumn()

        Judul("6. Box + Column + Row")
        LatihanBoxColumnRow()
    }
}

// ---------- Komponen bantu ----------

@Composable
private fun Judul(teks: String) {
    Text(
        text = teks,
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
    )
}
}
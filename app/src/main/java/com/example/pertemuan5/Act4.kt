package com.example.pertemuan5

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun FormDataDiri(modifier: Modifier) {
    var textNama by remember {mutableStateOf( value = "")}
    var textAlamat by remember {mutableStateOf( value = "")}
    var textJK by remember {mutableStateOf( value = "")}
    val gender = listOf("Laki-laki", "Perempuan")
}
// variabel-variabel untuk menyimpan data input yang diperoleh dari komponen UI
var nama by remember { mutableStateOf("") }
var alamat by remember { mutableStateOf("") }
var jenis by remember { mutableStateOf("") }
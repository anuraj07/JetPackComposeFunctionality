package com.deep.myapplication.whatsapp.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.deep.myapplication.utils.CountryCodePickerUtil
import com.deep.myapplication.utils.getCountriesList

class WhatsAppViewModel: ViewModel() {
    var phoneNumber by mutableStateOf("")
    val countriesList = getCountriesList()
    var mobileCountry by mutableStateOf(CountryCodePickerUtil("in", "91", "India"))
}
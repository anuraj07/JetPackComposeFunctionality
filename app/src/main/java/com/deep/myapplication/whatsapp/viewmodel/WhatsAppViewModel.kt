package com.deep.myapplication.whatsapp.viewmodel

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.deep.myapplication.utils.CountryCodePickerUtil
import com.deep.myapplication.utils.getCountriesList


class WhatsAppViewModel: ViewModel() {
    var phoneNumber by mutableStateOf("")
    var message by mutableStateOf("")
    val countriesList = getCountriesList()
    var mobileCountry by mutableStateOf(CountryCodePickerUtil("in", "91", "India"))

    fun handleButtonClick(context: Context) { // TODO("Add Validation on Phone number")
        val fullNumber = mobileCountry.code + phoneNumber
        val url = "https://api.whatsapp.com/send?phone=$fullNumber&text=$message"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        context.startActivity(i)
    }

    fun isWhatsAppInstalled(context: Context): Boolean {
        val pm: PackageManager = context.packageManager
        val appInstalled: Boolean = try {
            pm.getPackageInfo("com.whatsapp", PackageManager.GET_ACTIVITIES)
            true
        } catch (e: PackageManager.NameNotFoundException) {
            false
        }
        return appInstalled
    }

}
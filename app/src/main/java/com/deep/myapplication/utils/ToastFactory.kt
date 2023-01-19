package com.deep.myapplication.utils

import android.content.Context
import android.widget.Toast

object ToastFactory {
    fun showToast(context: Context, text: String) {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show()
    }
}
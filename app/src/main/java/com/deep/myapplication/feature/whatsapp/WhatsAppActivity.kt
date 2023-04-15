package com.deep.myapplication.feature.whatsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.deep.myapplication.ui.theme.Cornsilk
import com.deep.myapplication.ui.theme.Gold
import com.deep.myapplication.ui.theme.WallPaperComposeTheme
import com.deep.myapplication.utils.CountryCodePickerUtil
import com.deep.myapplication.utils.ToastFactory
import com.deep.myapplication.utils.getFlagEmojiFor
import com.deep.myapplication.feature.whatsapp.viewmodel.WhatsAppViewModel


class WhatsAppActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val viewModel: WhatsAppViewModel by viewModels()
            WallPaperComposeTheme {
                WhatsAppUI(viewModel)
            }
        }
    }
}

@Composable
fun WhatsAppUI(viewModel: WhatsAppViewModel) {
    val context = LocalContext.current
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Cornsilk)
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center),
            verticalArrangement = Arrangement.Center
        ) {
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = viewModel.phoneNumber,
                onValueChange = {
                    viewModel.phoneNumber = it
                },
                label = {
                    Text("Enter Phone Number", color = Gold)
                },
                keyboardOptions = KeyboardOptions(
                    imeAction = ImeAction.Next, keyboardType = KeyboardType.Phone
                ),
                textStyle = TextStyle(fontSize = 18.sp),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    unfocusedBorderColor = Color.Gray,
                ),
                leadingIcon = {
                    CountryPickerView(
                        countries = viewModel.countriesList,
                        selectedCountry = viewModel.mobileCountry,
                        onSelection = { selectedCountry ->
                            viewModel.mobileCountry = selectedCountry
                        },
                    )
                },
            )

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = viewModel.message,
                onValueChange = {
                    viewModel.message = it
                },
                label = {
                    Text("Enter Message (Optional)", color = Gold)
                },
                keyboardOptions = KeyboardOptions(
                    imeAction = ImeAction.Next, keyboardType = KeyboardType.Text
                ),
                textStyle = TextStyle(fontSize = 18.sp),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    unfocusedBorderColor = Color.Gray,
                )
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                onClick = {
                    if (viewModel.isWhatsAppInstalled(context)) {
                        viewModel.handleButtonClick(context)
                    } else {
                        ToastFactory.showToast(context, "WhatsApp Not Installed")
                    }

                }) {
                Text(text = "Send Message", modifier = Modifier.background(Color.Transparent))
            }
        }
    }
}

@Composable
fun CountryPickerView(
    selectedCountry: CountryCodePickerUtil,
    onSelection: (CountryCodePickerUtil) -> Unit,
    countries: List<CountryCodePickerUtil>
) {
    var showDialog by remember { mutableStateOf(false) }
    Text(modifier = Modifier
        .clickable {
            showDialog = true
        }
        .padding(start = 20.dp, end = 5.dp),
        text = "${getFlagEmojiFor(selectedCountry.nameCode)} +${selectedCountry.code}",
        color = Color.Black,
        fontSize = 18.sp)

    if (showDialog) CountryCodePickerDialog(countries, onSelection) {
        showDialog = false
    }
}

@Composable
fun CountryCodePickerDialog(
    countries: List<CountryCodePickerUtil>,
    onSelection: (CountryCodePickerUtil) -> Unit,
    dismiss: () -> Unit,
) {
    Dialog(onDismissRequest = dismiss) {
        Box {
            LazyColumn(
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 30.dp, vertical = 40.dp)
                    .background(shape = RoundedCornerShape(20.dp), color = Color.White)
            ) {
                for (country in countries) {
                    item {
                        Text(modifier = Modifier
                            .clickable {
                                onSelection(country)
                                dismiss()
                            }
                            .fillMaxWidth()
                            .padding(10.dp),
                            text = "${getFlagEmojiFor(country.nameCode)} ${country.fullName}",
                            color = Color.Black)
                    }
                }
            }
        }
    }
}
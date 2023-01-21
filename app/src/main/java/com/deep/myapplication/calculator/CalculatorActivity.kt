package com.deep.myapplication.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.deep.myapplication.calculator.customcomponent.Calculator
import com.deep.myapplication.calculator.viewmodel.CalculatorViewModel
import com.deep.myapplication.ui.theme.DarkSlateGray
import com.deep.myapplication.ui.theme.WallPaperComposeTheme

class CalculatorActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WallPaperComposeTheme {
                // A surface container using the 'background' color from the theme
                val viewModel: CalculatorViewModel by viewModels()
                val state = viewModel.state
                val buttonSpacing = 8.dp
                Calculator(
                    state = state,
                    onAction = viewModel::onAction,
                    buttonSpacing = buttonSpacing,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(DarkSlateGray)
                        .padding(16.dp)
                )
            }
        }
    }
}
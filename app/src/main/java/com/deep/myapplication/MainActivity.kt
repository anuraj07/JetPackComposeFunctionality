package com.deep.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.deep.myapplication.calculator.CalculatorActivity
import com.deep.myapplication.ui.theme.Coral
import com.deep.myapplication.ui.theme.Orange
import com.deep.myapplication.ui.theme.Tan
import com.deep.myapplication.ui.theme.WallPaperComposeTheme
import com.deep.myapplication.utils.ToastFactory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        https://pl.kotl.in/LeM95-Zt0  --> (color code)
        installSplashScreen()
        setContent {
            WallPaperComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                    color = Color.White
                ) {
                    MainContent()
                }
            }
        }
    }
}

@Composable
fun MainContent() {

    val context = LocalContext.current

    Column {
        TopAppBar(
            title = { Text(text = "Learning functionality using Compose", color = Color.White) },
            backgroundColor = Orange
        )
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
            ) {
                CustomCard("Calculator", Tan, R.drawable.calculator) {
                    context.startActivity(Intent(context, CalculatorActivity::class.java))
                }
                CustomCard(text = "Experiment 2") {
                    ToastFactory.showToast(context, "Feature not implemented")
                }
                CustomCard("Experiment 3") {
                    ToastFactory.showToast(context, "Feature not implemented")
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                CustomCard(text = "Experiment 4") {
                    ToastFactory.showToast(context, "Feature not implemented")
                }
                CustomCard("Experiment 5") {
                    ToastFactory.showToast(context, "Feature not implemented")
                }
                CustomCard("Experiment 6") {
                    ToastFactory.showToast(context, "Feature not implemented")
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                CustomCard("Experiment 7") {
                    ToastFactory.showToast(context, "Feature not implemented")
                }
                CustomCard("Experiment 8") {
                    ToastFactory.showToast(context, "Feature not implemented")
                }
                CustomCard("Experiment 9") {
                    ToastFactory.showToast(context, "Feature not implemented")
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CustomCard(text: String, color: Color = Coral, icon: Int = R.drawable.default_image, onClickListener: () -> Unit) {
    Card(
        modifier = Modifier
            .wrapContentSize()
            .clip(RoundedCornerShape(8.dp)),
        onClick = onClickListener
    ) {
        Column(
            modifier = Modifier
                .height(200.dp)
                .width(120.dp)
                .background(color = color),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            Image(
                painterResource(id = icon),
                contentDescription = "",
                modifier = Modifier
                    .height(32.dp)
                    .width(32.dp),
                alignment = Alignment.Center
            )
            Spacer(modifier = Modifier.height(50.dp))
            Text(
                modifier = Modifier.padding(8.dp),
                text = text,
                fontSize = 20.sp,
                color = Color.White,
                fontWeight = FontWeight(500),
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WallPaperComposeTheme {
        MainContent()
    }
}
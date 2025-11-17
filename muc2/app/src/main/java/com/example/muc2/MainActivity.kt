package com.example.muc2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.muc2.ui.theme.Muc2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Muc2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Layout(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Layout(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(2f)
                .fillMaxWidth()
                .background(Color.Red)
        ) {
            Text("1", fontSize = 30.sp)
        }
        Row(modifier = Modifier.weight(8f)) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .weight(3f)
                    .fillMaxHeight()
                    .background(Color.Yellow)
            ) {
                Text("2", fontSize = 30.sp)
            }
            Column(modifier = Modifier.weight(7f)) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .weight(6f)
                        .fillMaxWidth()
                        .background(Color.Blue)
                ) {
                    Text("3", fontSize = 30.sp, color = Color.White)
                }
                Row(modifier = Modifier.weight(4f)) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                            .background(Color(0xFFF48FB1)) // Pink
                    ) {
                        Text("4", fontSize = 30.sp)
                    }
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                            .background(Color(0xFFCE93D8)) // Purple
                    ) {
                        Text("5", fontSize = 30.sp)
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Slide95LayoutPreview() {
    Muc2Theme {
        Layout()
    }
}

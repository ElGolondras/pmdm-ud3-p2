package com.wuan.pmdm_ud3_p2

import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wuan.pmdm_ud3_p2.ui.theme.PMDMUd3p2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LayoutFilasColumnas()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LayoutFilasColumnas() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
    ) {
        Text("Filas", fontSize = 20.sp)
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .padding(top = 20.dp)
                    .padding(start = 0.dp)
            ) {
                Text("Fila 1", fontSize = 20.sp)
                Spacer(modifier = Modifier.width(16.dp))
                Text("Fila 1", fontSize = 20.sp)
                Spacer(modifier = Modifier.width(16.dp))
                Text("Fila 1", fontSize = 20.sp)
                Spacer(modifier = Modifier.width(16.dp))
                Text("Fila 1", fontSize = 20.sp)
            }

            Row(
                modifier = Modifier
                    .padding(top = 20.dp)
                    .padding(start = 0.dp)
            ) {
                Text("Fila 2", fontSize = 20.sp)
                Spacer(modifier = Modifier.width(16.dp))
                Text("Fila 2", fontSize = 20.sp)
                Spacer(modifier = Modifier.width(16.dp))
                Text("Fila 2", fontSize = 20.sp)
                Spacer(modifier = Modifier.width(16.dp))
                Text("Fila 2", fontSize = 20.sp)
            }

            Row(
                modifier = Modifier
                    .padding(top = 20.dp)
                    .padding(start = 0.dp)
            ) {
                Text("Fila 3", fontSize = 20.sp)
                Spacer(modifier = Modifier.width(16.dp))
                Text("Fila 3", fontSize = 20.sp)
                Spacer(modifier = Modifier.width(16.dp))
                Text("Fila 3", fontSize = 20.sp)
                Spacer(modifier = Modifier.width(16.dp))
                Text("Fila 3", fontSize = 20.sp)
            }

            Row(
                modifier = Modifier
                    .padding(top = 20.dp)
                    .padding(start = 0.dp)
            ) {
                Text("Fila 4", fontSize = 20.sp)
                Spacer(modifier = Modifier.width(16.dp))
                Text("Fila 4", fontSize = 20.sp)
                Spacer(modifier = Modifier.width(16.dp))
                Text("Fila 4", fontSize = 20.sp)
                Spacer(modifier = Modifier.width(16.dp))
                Text("Fila 4", fontSize = 20.sp)
            }
        }

        Spacer( modifier = Modifier.padding(60.dp))

        Text("Columnas", fontSize = 20.sp)
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .padding(top = 20.dp)
                    .padding(start = 0.dp)
            ) {
                Text("Fila 1", fontSize = 20.sp)
                Spacer(modifier = Modifier.height(16.dp))
                Text("Fila 1", fontSize = 20.sp)
                Spacer(modifier = Modifier.height(16.dp))
                Text("Fila 1", fontSize = 20.sp)
                Spacer(modifier = Modifier.height(16.dp))
                Text("Fila 1", fontSize = 20.sp)
            }

            Spacer(modifier = Modifier.width(20.dp))

            Column(
                modifier = Modifier
                    .padding(top = 20.dp)
                    .padding(start = 0.dp)
            ) {
                Text("Fila 2", fontSize = 20.sp)
                Spacer(modifier = Modifier.height(16.dp))
                Text("Fila 2", fontSize = 20.sp)
                Spacer(modifier = Modifier.height(16.dp))
                Text("Fila 2", fontSize = 20.sp)
                Spacer(modifier = Modifier.height(16.dp))
                Text("Fila 2", fontSize = 20.sp)
            }

            Spacer(modifier = Modifier.width(20.dp))

            Column(
                modifier = Modifier
                    .padding(top = 20.dp)
                    .padding(start = 0.dp)
            ) {
                Text("Fila 3", fontSize = 20.sp)
                Spacer(modifier = Modifier.height(16.dp))
                Text("Fila 3", fontSize = 20.sp)
                Spacer(modifier = Modifier.height(16.dp))
                Text("Fila 3", fontSize = 20.sp)
                Spacer(modifier = Modifier.height(16.dp))
                Text("Fila 3", fontSize = 20.sp)
            }

            Spacer(modifier = Modifier.width(20.dp))

            Column(
                modifier = Modifier
                    .padding(top = 20.dp)
                    .padding(start = 0.dp)
            ) {
                Text("Fila 4", fontSize = 20.sp)
                Spacer(modifier = Modifier.height(16.dp))
                Text("Fila 4", fontSize = 20.sp)
                Spacer(modifier = Modifier.height(16.dp))
                Text("Fila 4", fontSize = 20.sp)
                Spacer(modifier = Modifier.height(16.dp))
                Text("Fila 4", fontSize = 20.sp)
            }
        }
    }
}

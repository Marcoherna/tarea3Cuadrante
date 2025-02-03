package cl.kayohimu.cuadrantecompose

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
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cl.kayohimu.cuadrantecompose.ui.theme.CuadranteComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CuadranteComposeTheme {
                Surface {
                    CuatroCuadrantes()
                }

            }
        }
    }
}

@Composable
fun CuatroCuadrantes() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.weight(1f)) {
            Boxes(
                "Text composable",
                "Displays text and follows the recommended Material Design guidelines.",
                Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color(0xFFEADDFF))
                    .padding(16.dp)
            )
            Boxes(
                "Image composable",
                "Creates a composable that lays out and draws a given Painter class object.",
                Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color(0xFFD0BCFF))
                    .padding(16.dp)
            )

        }
        Row(modifier = Modifier.weight(1f)) {
            Boxes(
                "Row composable"
                , "A layout composable that places its children in a horizontal sequence.",
                Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color(0xFFB69DF8))
                    .padding(16.dp)
            )
            Boxes(
                "Column composable",
                "A layout composable that places its children in a vertical sequence.",
                Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color(0xFFF6EDFF))
                    .padding(16.dp)
            )

        }
    }

}

@Composable
fun Boxes(titulo: String, descripcion: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = titulo,
                modifier = Modifier.padding(bottom = 16.dp),
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Text(
                text = descripcion,
                textAlign = TextAlign.Justify,
                color = Color.Black
            )

        }
    }

}



@Preview(showBackground = true)
@Composable
fun CuatroCuadrantesPreview() {
    Row(modifier = Modifier.fillMaxSize()) {
        CuatroCuadrantes()
    }

}
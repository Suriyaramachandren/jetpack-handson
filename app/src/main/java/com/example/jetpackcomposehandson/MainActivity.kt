package com.example.jetpackcomposehandson


import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.jetpackcomposehandson.ui.theme.JetpackComposeHandsOnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        enableEdgeToEdge()
        setContent {
//            JetpackComposeHandsOnTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//
//                }
//            }
//            Box_Row_Column()
            MyButton()
            LearnImage()

        }
    }
}

@Composable
fun LearnImage() {

//    Image(painter = )

}


@Composable
fun MyButton() {
    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Button(

            onClick = { Toast.makeText(context, "Button Clicked", Toast.LENGTH_SHORT).show() },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
        ) {
            Text("Login")
        }
    }
}


/*Alignment = Cross Axis (Vertical(Row) | Horizontal(Column))*/
/*Arrangement = Main Axis (Vertical(Column) | Horizontal(Row))*/

/*Box_Row_Column*/
@Composable
fun Box_Row_Column() {
    val context = LocalContext.current
    val myCustomClickable = { Toast.makeText(context, "This is Clicked", Toast.LENGTH_LONG).show() }

    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "This is Surya Ramachandran",
            color = Color.Black,
            fontSize = 16.sp,

            )
        Text(
            text = stringResource(R.string.test_string),
            color = Color.Blue,
            fontSize = 16.sp,
            modifier = Modifier
                .background(Color.Transparent)
                .clickable(onClick = myCustomClickable)

        )


    }




    Row(
        modifier = Modifier
            .background(Color.Yellow)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {


        Text(
            text = "Hello",
            color = Color.Black,
            fontSize = 16.sp,
        )
        Text(
            text = "Android.!",
            color = Color.Blue,
            fontSize = 16.sp,
        )

    }
    Box(
        modifier = Modifier
            .size(300.dp, 300.dp)
            .background(Color.LightGray),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .size(100.dp, 100.dp)
                .background(Color.Green),
            contentAlignment = Alignment.Center

        ) {
            Text("This is BOx")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeHandsOnTheme {
//        Box_Row_Column()
//        ArrangementAlignment()
//        MyButton()
        LearnImage()
    }
}


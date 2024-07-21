package co.edu.sena.login2902093.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.edu.sena.login2902093.R
import co.edu.sena.login2902093.ui.theme.TextColor


@Composable

fun NormalTextComponent(values:String){
    Text(
        text = values,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 80.dp),
        style = TextStyle(
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal
        )

        , color = colorResource(id = R.color.colorText),
        textAlign = TextAlign.Center
    )
} //NormalTextComponent



@Composable

fun HeadingTextComponent(values:String){
    Text(
        text = values,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 80.dp),
        style = TextStyle(
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal
        )

        , color = colorResource(id = R.color.colorText),
        textAlign = TextAlign.Center
    )
} //HeadingTextComponent


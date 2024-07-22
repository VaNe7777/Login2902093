package co.edu.sena.login2902093.components

import android.support.v4.os.IResultReceiver.Default
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.edu.sena.login2902093.R
import co.edu.sena.login2902093.ui.theme.Primary
import co.edu.sena.login2902093.ui.theme.TextColor


@Composable

fun NormalTextComponent(values:String){
    Text(
        text = values,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 40.dp),
        style = TextStyle(
            fontSize = 24.sp,
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
            .heightIn(),
        style = TextStyle(
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal
        )

        , color = colorResource(id = R.color.colorText),
        textAlign = TextAlign.Center
    )
} //HeadingTextComponent


@Composable

fun MyTextField(labelValue:String){
    val textValue = remember {
        mutableStateOf("")
    }

    OutlinedTextField(
        label = {Text(text = labelValue)},
        value = textValue,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Primary,
            focusedLabelColor = Primary,
            cursorColor = Primary
        ),

        keyboardOptions = KeyboardOptions.Default,
        value = textValue.value,
        onValueChange = {
            textValue.value = it
        }

    )
}

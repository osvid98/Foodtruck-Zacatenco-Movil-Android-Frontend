package mx.ipn.escom.verac.foodtruck.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mx.ipn.escom.verac.foodtruck.R
import mx.ipn.escom.verac.foodtruck.components.ButtonComponent
import mx.ipn.escom.verac.foodtruck.components.ClickLoginTextComponent
import mx.ipn.escom.verac.foodtruck.components.DividerTextComponent
import mx.ipn.escom.verac.foodtruck.components.MyTextFieldComponent
import mx.ipn.escom.verac.foodtruck.components.NormalTextComponent
import mx.ipn.escom.verac.foodtruck.components.PasswordTextFieldComponent
import mx.ipn.escom.verac.foodtruck.components.RadioButtonGroupComponent
import mx.ipn.escom.verac.foodtruck.components.TituloTextComponent
import mx.ipn.escom.verac.foodtruck.theme.GrayColor
import mx.ipn.escom.verac.foodtruck.theme.TextColor


@Composable
fun SignUpScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)

    ) {
        Column(modifier = Modifier.fillMaxSize()){
            NormalTextComponent(value = stringResource(id = R.string.bienvenida))
            TituloTextComponent(value = stringResource(id = R.string.crear_cuenta))
            Spacer(modifier = Modifier.height(20.dp))

            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.nombre),
                painterResource = painterResource(id = R.drawable.profile)
            )

            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.apellido_paterno),
                painterResource = painterResource(id = R.drawable.profile)
            )

            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.apellido_materno),
                painterResource = painterResource(id = R.drawable.profile)
            )

            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.email),
                painterResource = painterResource(id = R.drawable.message)
            )

            PasswordTextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                painterResource = painterResource(id = R.drawable.lock)
            )
            Spacer(modifier = Modifier.height(10.dp))
            RadioButtonGroupComponent(
                option1 = stringResource(id = R.string.registro_usuario), 
                option2 = stringResource(id = R.string.registro_empleado) )

            ButtonComponent(
                value = stringResource(id = R.string.registro_boton),
                onButtonClicked = { /*TODO*/ })

            DividerTextComponent()
            ClickLoginTextComponent(onTextSelected = {})


        }






    }
}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen(){
    SignUpScreen()
}


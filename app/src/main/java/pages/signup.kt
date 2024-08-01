package pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun SignUpPage()
{
    var firstname by remember { mutableStateOf("") }
    var lastname by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirm by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "third",
                fontSize = 40.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Gray
            )
            Text(
                text = "Hand",
                fontSize = 40.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.DarkGray
            )
        }
        Spacer(modifier = Modifier.height(25.dp))
        Text(text = "Registration", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        OutlinedTextField(
            value = firstname,
            onValueChange = { firstname = it },
            label = { Text(text = "First Name") },
        )
        OutlinedTextField(
            value = lastname,
            onValueChange = { lastname = it },
            label = { Text(text = "Last Name") },
        )
        OutlinedTextField(
            value = phone,
            onValueChange = { phone = it },
            label = { Text(text = "Phone")}
        )
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text(text = "Email")},
        )
        OutlinedTextField(
            value = password,
            onValueChange = {password = it },
            label = { Text(text = "Password") },
            visualTransformation = PasswordVisualTransformation()
        )
        OutlinedTextField(
            value = confirm,
            onValueChange = {confirm = it },
            label = { Text(text = "Confirm Password") },
            visualTransformation = PasswordVisualTransformation()
        )
        Spacer(modifier = Modifier.height(15.dp))
        Button(onClick = { }) {
            Text(text = "Create Account")
            
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Already have an account?")
            TextButton(onClick = { }) {
                Text(text = "Login", color = Color.Blue)
            }
        }

    }

}
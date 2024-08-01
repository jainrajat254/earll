package pages

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.earll.R

@Preview(showBackground = true)
@Composable
fun LoginScreen() {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(20.dp))
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
        Spacer(modifier = Modifier.height(80.dp))
        Text(text = "Login", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold)

        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            label = { Text(text = "Username") }
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text(text = "Password") },
            visualTransformation = PasswordVisualTransformation()
        )
        Spacer(modifier = Modifier.height(12.dp))
        Button(
            onClick = { Log.i("Credentials", "Username: $username, Password: $password") }
        ) {
            Text(text = "Login", fontWeight = FontWeight.SemiBold)
        }
        Spacer(modifier = Modifier.height(10.dp))
        TextButton(
            onClick = { }
        ) {
            Text(text = "Forgot Password ?")
        }
        Text(text = "Sign in with ")
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.google),
                contentDescription = "Google",
                modifier = Modifier
                    .size(40.dp)
                    .clickable { }
            )
            Spacer(modifier = Modifier.width(15.dp))
            Image(
                painter = painterResource(id = R.drawable.fb),
                contentDescription = "Facebook",
                modifier = Modifier
                    .size(40.dp)
                    .clickable { }
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Don't have an account?")
            TextButton(onClick = { }) {
                Text(text = "Create Account", color = Color.Blue)
            }
        }
    }
}

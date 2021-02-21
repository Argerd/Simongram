package com.argerd.simongram.ui.login.phone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import com.argerd.simongram.R
import com.argerd.simongram.ui.theme.SimongramTheme

class LoginPhoneFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                LoginPhone()
            }
        }
    }

    @Composable
    fun LoginPhone() {
        SimongramTheme {
            Column {
                TopAppBar {
                    Text(
                        text = "Login",
                        modifier = Modifier
                            .padding(start = 16.dp)
                            .align(Alignment.CenterVertically)
                    )
                }
                Row(Modifier.padding(16.dp)) {
                    Text(text = getString(R.string.plus), modifier = Modifier.padding(end = 4.dp))
                    Counter()
                }
            }
        }
    }

    @Composable
    fun Counter() {
        val count = remember { mutableStateOf(0) }

        Button(onClick = { count.value++ }) {
            Text("I've been clicked ${count.value} times")
        }
    }
}
package com.batch.compose_practice.ui.count_up

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.batch.compose_practice.R

@Composable
fun CountUpScreen(navController: NavController) {
    Scaffold(
        topBar = {
            val title = stringResource(id = R.string.count_up_title)
            TopAppBar(title = { Text(text = title) })
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                },
                content = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_baseline_plus_one),
                        contentDescription = null
                    )
                }
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(text = "Hello", style = MaterialTheme.typography.body1)
        }
    }
}
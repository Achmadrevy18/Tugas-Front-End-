package com.example.frontend

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.frontend.ui.theme.FrontEndTheme

@Composable
fun MainTopBar(modifier: Modifier = Modifier){
    Column(modifier = modifier.padding(16.dp)) {
        Row(modifier = modifier.width(IntrinsicSize.Min),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Spacer(modifier = Modifier.height(60.dp))
            OutlinedTextField(
                modifier = modifier
                    .widthIn(min = 320.dp),
                value = "",
                onValueChange = {},
                leadingIcon = { Icon(
                    imageVector = Icons.Outlined.Search,
                    contentDescription = null
                ) },
                placeholder = { Text(text = "Search Here") }
            )
            Spacer(modifier = Modifier.height(120.dp))
            Icon(
                imageVector = Icons.Outlined.Notifications,
                contentDescription = null,
                modifier = modifier.size(40.dp)
            )



        }
    }


}

@Preview(showBackground = true)
@Composable
fun MainTopBarPreview(){
    FrontEndTheme {
        MainTopBar()
    }
}

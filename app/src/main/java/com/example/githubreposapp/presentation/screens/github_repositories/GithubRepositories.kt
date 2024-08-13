package com.example.githubreposapp.presentation.screens.github_repositories
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.githubreposapp.R
import com.example.githubreposapp.presentation.screens.common_components.AppBar

@ExperimentalMaterial3Api
@Composable
fun GithubRepositories(
    modifier: Modifier = Modifier,
    ) {
    Scaffold (
        modifier=Modifier.fillMaxSize(),
        topBar = {
            AppBar(
                title = R.string.repository_screen_title,
                showBackButton = false
            )
        }
        )
    {innerPadding ->
        Column (
            modifier= Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(top = 60.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Image(painter = painterResource(id =R.drawable.img),
                contentDescription = stringResource(R.string.timeout_exception_message),
                modifier= Modifier
                    .fillMaxWidth()
                    .height(380.dp)
                )
            Text(
                text = stringResource(id = R.string.something_went_wrong) ,
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.SemiBold
                )

            Text(
                modifier = Modifier.padding(bottom = 100.dp, top = 10.dp),
                text = stringResource(id = R.string.network_exception_meesage) ,
                color=Color.Gray
                )
            Button(
                onClick ={},
                modifier= Modifier
                    .padding(horizontal = 25.dp)
                    .fillMaxWidth()
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = MaterialTheme.colorScheme.secondary
                ),
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(width = 3.dp,
                    color =MaterialTheme.colorScheme.secondary)
            ) {
                Text(
                    text = stringResource(id = R.string.retry) ,
                    style = MaterialTheme.typography.headlineSmall

                )
            }


        }

    }

}

@ExperimentalMaterial3Api
@Preview
@Composable
private fun PreviewGithubRepositories() {
    GithubRepositories()
}
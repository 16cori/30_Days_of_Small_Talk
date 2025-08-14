package com.example.a30daysofsmalltalk

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30daysofsmalltalk.data.DailyTasks
import com.example.a30daysofsmalltalk.data.dailyTasks
import com.example.a30daysofsmalltalk.ui.theme._30DaysOfSmallTalkTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.a30daysofsmalltalk.ui.theme.onPrimaryContainerLight
import com.example.a30daysofsmalltalk.ui.theme.onPrimaryLightMediumContrast
import com.example.a30daysofsmalltalk.ui.theme.onSecondaryContainerLightMediumContrast
import com.example.a30daysofsmalltalk.ui.theme.onSurfaceLight
import com.example.a30daysofsmalltalk.ui.theme.secondaryContainerLight
import kotlinx.serialization.internal.throwMissingFieldException

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _30DaysOfSmallTalkTheme {
                Surface (
                    modifier = Modifier.fillMaxSize()
                ){
                    SmallTalkApp()
                }
            }
        }
    }
}

@Composable
fun SmallTalkApp()  {
   Scaffold (
       topBar = {
           TopAppBar()
       },
   )
   {
       it ->
       LazyColumn(contentPadding = it){
           items(dailyTasks){ it ->
               DailyCard(
                   dailyTasks = it,
                   modifier = Modifier.padding(8.dp)
               )
               }
           }
       }
   }


@Composable
fun DailyCard(
    dailyTasks: DailyTasks,
    modifier: Modifier = Modifier) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = onPrimaryLightMediumContrast
        ),
        modifier = modifier
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.padding_small)),

        ) {
            Text(
                text = stringResource(dailyTasks.dayNumber),
                style = MaterialTheme.typography.labelSmall
            )
            Text(
                text = stringResource(dailyTasks.challengeTitle),
                style = MaterialTheme.typography.titleLarge,
            )
            Spacer(modifier = Modifier.weight(1f))
            SmallTalkImage(
                dailyTasks.imageResourceId,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(dimensionResource(R.dimen.image_size))
                    .padding(dimensionResource(R.dimen.padding_small))
                    .clip(MaterialTheme.shapes.small)
            )
            Text(
                text = stringResource(dailyTasks.challengeDescription),
                style = MaterialTheme.typography.bodyLarge,
            )
        }

    }
    }

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .clip(RoundedCornerShape(16.dp))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.title),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = stringResource(R.string.app_name),
                    style = MaterialTheme.typography.displaySmall.copy(color = Color.White),
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        },
        modifier = modifier
    )
}


@Composable
fun SmallTalkImage(
    @DrawableRes taskIcon: Int,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(id = taskIcon),
        contentDescription = null,
        modifier = modifier,
        contentScale = ContentScale.Crop
    )
}


@Preview
@Composable
fun GreetingPreview() {
    _30DaysOfSmallTalkTheme(darkTheme = false) {
        SmallTalkApp()
    }
}

//@Preview(showBackground = true)
//@Composable
//fun TestImage() {
//    Image(
//        painter = painterResource(id = R.drawable.day1),
//        contentDescription = "Test image",
//        modifier = Modifier.size(100.dp)
//    )
//}


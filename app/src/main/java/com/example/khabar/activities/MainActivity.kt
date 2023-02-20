package com.example.khabar.activities

import androidx.activity.viewModels
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.khabar.state.HomeState
import com.example.khabar.ui.HomePage
import com.example.khabar.ui.theme.KhabarTheme
import com.example.khabar.viewmodel.HomeVM
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : BaseActivity<HomeVM, HomeState>()
{

    override val viewModel: HomeVM by viewModels()

    @Composable
    override fun Content() {
        // Greeting(name = "hello suraj")
        HomePage(
            viewModel
            )
    }

//    val viewModel: NewsAppViewModel by viewModels();
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            KhabarTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                   // HomePage(vm = viewModel)
//                    Greeting("Android")
//                }
//            }
//        }
//    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    KhabarTheme {
        Greeting("Android")
    }
}
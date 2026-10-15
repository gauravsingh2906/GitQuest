
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.codelab.gitquest.ui.theme.GitQuestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GitQuestTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    GitQuestScreen()
                    print("Added for git rebase now this line will update in feature/dark-theme")
                    print("Broken screen")
                    print("Added in feature/taskCounter branch")
                    print("Added in feature/dark theme branch")
                }
            }
        }
    }
}


@Composable
fun GitQuestScreen() {
    var completedTasks by remember { mutableIntStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "GitQuest - Changed Locally",
            style = MaterialTheme.typography.headlineLarge
        )

        Text(
            text = "Tasks completed: $completedTasks",
            modifier = Modifier.padding(vertical = 16.dp)
        )

        Button(
            onClick = { completedTasks++ }
        ) {
            Text("Complete a task")
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GitQuestTheme {
        Greeting("Android")
    }
}
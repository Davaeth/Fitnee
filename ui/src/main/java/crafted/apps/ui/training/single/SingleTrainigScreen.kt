package crafted.apps.ui.training.single

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import crafted.apps.model.Exercise
import crafted.apps.model.Training
import crafted.apps.ui.theme.FitneeTheme
import java.time.LocalDate

val testData = listOf(
    Training(
        "23432",
        listOf(
            Exercise("pullup", 4),
            Exercise("plank", 3),
            Exercise("pushup", 10),
            Exercise("dips", 13),
        ),
        LocalDate.now(),
        12
    ),
)

@Composable
fun SingleTrainingScreen() {
    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(testData.first().exercises) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = it.name)
                Text(text = it.reps.toString())
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    FitneeTheme {
        SingleTrainingScreen()
    }
}
package crafted.apps.model

import java.time.LocalDate

data class Training(
    val id: String,
    val exercises: List<Exercise>,
    val date: LocalDate,
    val number: Int
)

data class Exercise(
    val name: String,
    val reps: Int
)
package alanacarolayne.com.github.listaslazy.components
import alanacarolayne.com.github.listaslazy.model.Game
import alanacarolayne.com.github.listaslazy.ui.theme.ListaslazyTheme
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
@Composable
fun StudioCard(game: Game, onClick: (() -> Unit)? = null) {
    Card(modifier = Modifier
        .size(100.dp)
        .padding(end = 4.dp)
        .clickable(enabled = onClick != null) { onClick?.invoke() }) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(text = game.studio)
        }
    }
}

@Preview(showBackground = true, name = "Studio Card Preview")
@Composable
fun PreviewStudioCard() {
   ListaslazyTheme {
        StudioCard(game = Game(1, "Example Game", "Example Studio", 2023));
    }
}
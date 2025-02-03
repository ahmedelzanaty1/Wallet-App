package Screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Scaffold(
        bottomBar = {}
    ) {
        innerPadding ->
        Column(modifier = modifier.padding(innerPadding)) {
//            WalletSection()
//            CardsSection()
            Spacer(modifier = Modifier.padding(10.dp))
//            FinanceSection()
//            CurrenciesSection()

        }
    }

}
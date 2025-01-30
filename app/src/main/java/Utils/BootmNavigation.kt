package Utils

import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun BottomNavigation(modifier: Modifier = Modifier , navItems : List<BottomNavItem>) {

    NavigationBar(modifier = modifier){}
}
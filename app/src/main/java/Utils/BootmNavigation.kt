package Utils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun BottomNavigation(modifier: Modifier = Modifier , navItems : List<BottomNavItem>) {

    NavigationBar(modifier = modifier){
        Row(modifier = modifier.background(MaterialTheme.colorScheme.inverseOnSurface)){
            navItems.forEachIndexed { index, bottomNavItem ->
               NavigationBarItem(
                   selected = index == 0,
                   onClick = { /*TODO*/ },
                   icon = {
                       Icon(imageVector = bottomNavItem.Icon, contentDescription = bottomNavItem.Title ,
                           tint = MaterialTheme.colorScheme.onBackground)
                   } , label = {
                       Text(text = bottomNavItem.Title , color = MaterialTheme.colorScheme.onBackground)
                   })
            }

        }

            }
        }

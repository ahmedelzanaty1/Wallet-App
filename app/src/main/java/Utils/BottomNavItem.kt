package Utils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.MailOutline
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    val Title : String,
    val Icon : ImageVector,
)val bottomNavItems = listOf(
    BottomNavItem(
        Title = "Home",
        Icon = Icons.Rounded.Home
    ),
    BottomNavItem(
        Title = "Wallet",
        Icon = Icons.Rounded.Wallet
    ),
    BottomNavItem(
        Title = "Notifications",
        Icon = Icons.Rounded.Notifications
    ),
    BottomNavItem(
        Title = "Account",
        Icon = Icons.Rounded.AccountCircle
    ),

)

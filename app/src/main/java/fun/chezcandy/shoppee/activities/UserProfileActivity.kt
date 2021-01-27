package `fun`.chezcandy.shoppee.activities

import `fun`.chezcandy.shoppee.R
import `fun`.chezcandy.shoppee.models.User
import `fun`.chezcandy.shoppee.utils.Constants
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_user_profile.*

class UserProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)

        var userDetails: User = User()
        if (intent.hasExtra(Constants.EXTRA_USER_DETAILS)) {
            // Get the user details from intent as a ParcelableExtra.
            userDetails = intent.getParcelableExtra(Constants.EXTRA_USER_DETAILS)!!
        }

        et_first_name.isEnabled = false
        et_first_name.setText(userDetails.firstName)

        et_last_name.isEnabled = false
        et_last_name.setText(userDetails.lastName)

        et_email.isEnabled = false
        et_email.setText(userDetails.email)


        @Suppress("DEPRECATION")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }

    }
}
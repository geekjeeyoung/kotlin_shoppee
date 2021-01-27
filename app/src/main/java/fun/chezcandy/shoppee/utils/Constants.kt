package `fun`.chezcandy.shoppee.utils

import android.app.Activity
import android.content.Intent
import android.provider.MediaStore

object Constants {
    const val USERS: String = "users"
    const val READ_STORAGE_PERMISSIONS_CODE: Int = 2
    const val MYSHOPPEE_PREFERENCES: String = "MyShoppeePrefs"
    const val LOGGED_IN_USERNAME: String = "logged_in_username"
    const val EXTRA_USER_DETAILS: String = "extra_user_details"
    const val PICK_IMAGE_REQUEST_CODE: Int = 1

    fun showImageChooser(activity: Activity) {
        // An intent for launching the image selection of phone storage.

        val galleryIntent = Intent(
            Intent.ACTION_PICK,
            MediaStore.Images.Media.EXTERNAL_CONTENT_URI
        )

        // Launches the image selection of phone storage using the constant code.
        activity.startActivityForResult(galleryIntent, PICK_IMAGE_REQUEST_CODE)
    }
}
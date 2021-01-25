package `fun`.chezcandy.shoppee.activities

import `fun`.chezcandy.shoppee.R
import android.app.Dialog
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.WindowInsets
import android.view.WindowManager
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.dialog_progress.*

open class BaseActivity : AppCompatActivity() {

    private lateinit var mPregressDialog: Dialog

    fun showErrorSnackBar(message: String, errorMessage: Boolean) {
        val snackBar =
            Snackbar.make(findViewById(android.R.id.content), message, Snackbar.LENGTH_LONG)
        val snackBarView = snackBar.view

        if (errorMessage) {
            snackBarView.setBackgroundColor(
                ContextCompat.getColor(
                    this@BaseActivity,
                    R.color.colorSnackBarError
                )
            )
        } else {
            snackBarView.setBackgroundColor(
                ContextCompat.getColor(
                    this@BaseActivity,
                    R.color.colorSnackBarSuccess
                )
            )
        }
        snackBar.show()
    }


    fun showProgressDialog(text: String) {
        mPregressDialog = Dialog(this)

        // Set the screen content from a layout resource.
        // The resource will be inflated, adding all top-level views to the screen

        mPregressDialog.setContentView(R.layout.dialog_progress)

        mPregressDialog.tv_progress_text.text = text

        mPregressDialog.setCancelable(false)
        mPregressDialog.setCanceledOnTouchOutside(false)

        mPregressDialog.show()
    }

    fun hideProgressDialog() {
        mPregressDialog.dismiss()
    }
}

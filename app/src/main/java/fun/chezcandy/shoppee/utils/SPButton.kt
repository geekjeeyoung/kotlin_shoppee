package `fun`.chezcandy.shoppee.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton

class SPButton(context: Context, attrs: AttributeSet): AppCompatButton(context, attrs) {
    init {
        applyFont()
    }

    private fun applyFont() {
        val typeface: Typeface =
            Typeface.createFromAsset(context.assets, "Montserrat/Montserrat-Bold.ttf")
        setTypeface(typeface)
    }
}
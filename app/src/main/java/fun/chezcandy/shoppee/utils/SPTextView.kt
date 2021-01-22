package `fun`.chezcandy.shoppee.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class SPTextView(context: Context, attrs: AttributeSet) : AppCompatTextView(context, attrs) {
    init {
        applyFont()
    }

    private fun applyFont() {
        val typeface: Typeface =
            Typeface.createFromAsset(context.assets, "Montserrat/Montserrat-Regular.ttf")
        setTypeface(typeface)
    }
}
package np.com.example.miniclip.util

import android.content.Context
import android.widget.Toast

object UiUtil {

    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

    fun showToast(context: Context, resId: Int) {
        Toast.makeText(context, resId, Toast.LENGTH_LONG).show()
    }
}


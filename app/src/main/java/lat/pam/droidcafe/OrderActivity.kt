package lat.pam.droidcafe

import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)
        }

    fun onRadioButtonClicked(view: View) {
        val checked = (view as RadioButton).isChecked
                displayToast(getString(R.string.same_day_messenger_service))
                displayToast(getString(R.string.next_day_ground_delivery))
                displayToast(getString(R.string.pick_up))
        }
    }

    private fun displayToast(message: String) {
    }
}

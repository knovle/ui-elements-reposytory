package study.example.myfirstkasapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        Log.d(TAG, "Вот приходит замысел рисунка.")
    }

    override fun onStart() {
        super.onStart( )

        Log.d(TAG, "Поединок сердца и рассудка.")
    }

    override fun onResume() {
        super.onResume( )

        Log.d(TAG, "Иногда рассудок побеждает:")
    }

    override fun onPause() {
        super.onPause( )

        Log.d(TAG, "он довольно трезво рассуждает,")
    }

    override fun onStop() {
        super.onStop( )

        Log.d(TAG, "здравые высказывает мысли -")
    }

    override fun onRestart() {
        super.onRestart( )

        Log.d(TAG, "ну, и побеждает в этом смысле...")
    }

    override fun onDestroy() {
        super.onDestroy( )

        Log.d(TAG, "Юрий Левитанский")
    }

}
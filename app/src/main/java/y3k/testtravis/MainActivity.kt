package y3k.testtravis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson
import android.utils.Log
import com.google.gson.JsonObject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("TestGson",Gson().fromJson("{a:1}",JsonObject::class.java)+"")
    }
}

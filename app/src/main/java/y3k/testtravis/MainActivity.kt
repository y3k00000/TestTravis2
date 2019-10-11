package y3k.testtravis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson
import android.util.Log
import com.google.gson.JsonObject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gson = Gson()
        val json = gson.fromJson("{a:1}",JsonObject::class.java)
        Log.d("TestGson",gson.toJson(json))
    }
}

package id.ac.polbeng.nofiazuriatin.uts_nofiazuriatin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.nofiazuriatin.uts_nofiazuriatin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnhasil.setOnClickListener {
            hasil()
        }

        binding.btnClear.setOnClickListener {
            clear()
        }
    }

    private fun hasil() {
        val sisi = binding.sisi.text.toString().toDoubleOrNull()
        if (sisi != null) {
            // Menghitung luas kubus
            val luas = 6 * sisi * sisi
            val volume = sisi * sisi * sisi
            // Menampilkan hasil ke TextView
            binding.tvResult.text = "Luas Kubus Anda : $luas\n Volume Kubus Anda : $volume"
        } else {
            Toast.makeText(this, "Masukkan nilai Sisi yang valid", Toast.LENGTH_SHORT)
                .show()
        }
    }

    private fun clear() {
        binding.sisi.text.clear()
        binding.tvResult.text = ""
    }
}

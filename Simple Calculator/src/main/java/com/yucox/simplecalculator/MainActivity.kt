package com.yucox.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.yucox.simplecalculator.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    fun toplama(view : View){
        var sayi1 = binding.ilksayi.text.toString().toIntOrNull()
        var sayi2 = binding.ikincisayi.text.toString().toIntOrNull()
        if(sayi1 == null && sayi2 != null){
            binding.textView.text = "1. Boşluğu doldurunuz"
        }
        if(sayi2 == null && sayi1 != null){
            binding.textView.text = "2. Boşluğu doldurunuz"
        }
        if(sayi1 != null && sayi2 != null) {
            var sonuc = sayi1 + sayi2
            binding.textView.text = "Sonucunuz: ${sonuc.toString()}"
        }else if(sayi1 == null && sayi2 == null){
            binding.textView.text = "Boşukları doldurunuz."
        }

    }
    fun cikarma(view : View){
        var sayi1 = binding.ilksayi.text.toString().toIntOrNull()
        var sayi2 = binding.ikincisayi.text.toString().toIntOrNull()
        if(sayi1 == null && sayi2 != null){
            binding.textView.text = "1. Boşluğu doldurunuz"
        }
        if(sayi2 == null && sayi1 != null){
            binding.textView.text = "2. Boşluğu doldurunuz"
        }
        if(sayi1 != null && sayi2 != null) {
            var sonuc = sayi1 - sayi2
            binding.textView.text = "Sonucunuz: ${sonuc.toString()}"
        }else if(sayi1 == null && sayi2 == null){
            binding.textView.text = "Boşukları doldurunuz."
        }

    }
    fun carpma(view : View){

        var sayi1 = binding.ilksayi.text.toString().toIntOrNull()
        var sayi2 = binding.ikincisayi.text.toString().toIntOrNull()
        if(sayi1 == null && sayi2 != null){
            binding.textView.text = "1. Boşluğu doldurunuz"
        }
        if(sayi2 == null && sayi1 != null){
            binding.textView.text = "2. Boşluğu doldurunuz"
        }
        if(sayi1 != null && sayi2 != null) {
            var sonuc = sayi1 * sayi2
            binding.textView.text = "Sonucunuz ${sonuc.toString()}"
        }else if(sayi1 == null && sayi2 == null){
            binding.textView.text = "Boşukları doldurunuz."
        }

    }
    fun bolme(view : View){

        var sayi1 = binding.ilksayi.text.toString().toIntOrNull()
        var sayi2 = binding.ikincisayi.text.toString().toIntOrNull()
        if(sayi1 == null && sayi2 != null){
            binding.textView.text = "1. Boşluğu doldurunuz"
        }
        if(sayi2 == null && sayi1 != null){
            binding.textView.text = "2. Boşluğu doldurunuz"
        }
        if(sayi1 != null && sayi2 != null) {
            var sonuc = sayi1 / sayi2
            binding.textView.text = "Sonucunuz ${sonuc.toString()}"
        }else if(sayi1 == null && sayi2 == null){
            binding.textView.text = "Boşukları doldurunuz."
        }

    }
}
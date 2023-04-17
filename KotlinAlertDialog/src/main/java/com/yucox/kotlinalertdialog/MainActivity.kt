package com.yucox.kotlinalertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.yucox.kotlinalertdialog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //Toast ufak bir uyarı butonu çıkartmamıza yardımcı olur.
        Toast.makeText(applicationContext,"Welcome",Toast.LENGTH_SHORT).show()
        //Context

        //Activity Context -> Eğer ki aktivitenin contextini alacaksak; 'this' keywordunu kullanıyoruz.
        //App Context -> Eğer ki appin contextini alacaksak; 'applicationContext' bu gösterimi kullanıyoruz.
        //this@mainactivity ise, mainactivity adında bir etiket (label) kullanılarak belirli bir Activity
    // sınıfının örneğini ifade eden bir referanstır. Kotlin'de, aynı isme sahip birden fazla sınıfın
    // (örneğin, iç içe sınıfların) bulunduğu durumlarda, etiketler kullanarak hangi sınıfın this referansının
    // kullanıldığını belirtmek gerekebilir. Bu, iç içe geçmiş sınıfların içinde bulunduğu durumlarda kullanışlı
    // olabilir. Özellikle, iç içe sınıfların veya anonim sınıfların bulunduğu durumlarda this@mainactivity
    // gibi etiketli referanslar kullanarak, hangi sınıfın this referansına erişilmek istendiğini
    // belirleyebilirsiniz.
    }
    fun save(view : View){
        var alert = AlertDialog.Builder(this)
        alert.setTitle("save")
        alert.setMessage("Are you sure?")
        //Aşağıdaki lamda gösterimlerini kullandığımızda bize bir kod bloğu açar
        //ve butona basıldığında yapmak istediğimiz şeyleri oraya yazarız.
        alert.setPositiveButton("Yes") {_,_ ->
            //Listener
            Toast.makeText(applicationContext, "Saved", Toast.LENGTH_LONG).show()
        }
        alert.setNegativeButton("No") {_, _ ->
            //Listener
            Toast.makeText(applicationContext, "Not Saved", Toast.LENGTH_LONG).show()
        }
        alert.show()
        //AlertDialog.Builder sınıfı, bir AlertDialog oluştururken, ilgili Context'i (bağlamı) gerektirir.
        // Bu bağlam, kullanıcının etkileşimde bulunacağı ekranı temsil eder.
        // Bu nedenle, this kelimesi, AlertDialog'ın oluşturulduğu sınıfın bağlamını temsil eder
        // ve AlertDialog.Builder'ın doğru bir şekilde çalışabilmesi için gereklidir.
    }
}
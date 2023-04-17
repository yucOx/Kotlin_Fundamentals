NOTLAR
- Toast ufak bir uyarı butonu çıkartmamıza yardımcı olur.

Activity Context -> Eğer ki aktivitenin contextini alacaksak; 'this' keywordunu kullanıyoruz.
        App Context -> Eğer ki appin contextini alacaksak; 'applicationContext' bu gösterimi kullanıyoruz.

this@mainactivity ise, mainactivity adında bir etiket (label) kullanılarak belirli bir Activity
sınıfının örneğini ifade eden bir referanstır. Kotlin'de, aynı isme sahip birden fazla sınıfın
(örneğin, iç içe sınıfların) bulunduğu durumlarda, etiketler kullanarak hangi sınıfın this referansının
kullanıldığını belirtmek gerekebilir. Bu, iç içe geçmiş sınıfların içinde bulunduğu durumlarda kullanışlı
olabilir. Özellikle, iç içe sınıfların veya anonim sınıfların bulunduğu durumlarda this@mainactivity
gibi etiketli referanslar kullanarak, hangi sınıfın this referansına erişilmek istendiğini belirleyebilirsiniz.

AlertDialog.Builder sınıfı, bir AlertDialog oluştururken, ilgili Context'i (bağlamı) gerektirir. Bu bağlam, kullanıcının etkileşimde bulunacağı ekranı temsil eder.
Bu nedenle, this kelimesi, AlertDialog'ın oluşturulduğu sınıfın bağlamını temsil eder ve AlertDialog.Builder'ın doğru bir şekilde çalışabilmesi için gereklidir.

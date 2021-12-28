package com.beyzaakkuzu.recyclerviewproject


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.LinearLayoutManager
import com.beyzaakkuzu.recyclerview.Book
import com.beyzaakkuzu.recyclerview.BookAdapter
import com.beyzaakkuzu.recyclerview.R


import com.beyzaakkuzu.recyclerview.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var booklist : ArrayList<Book>
//test
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        booklist = ArrayList<Book>()

        val book1 = Book("Küçük Kara Balık","Samed Behrengi", R.drawable.img9,"Kitapları dünyanın birçok diline çevrilen, İran şahlık rejiminin muhalif yazarı Samed Behrengi'nin en ünlü iki kitabından biri olan Küçük Kara Balık, 12 Eylül Darbesi sürecinde Türkiye'de yasaklandığı gibi, halen İran'da da yasaklı kitaplar listesinde bulunmaktadır. Çocuklar için yazılan bir masal kitabı olmanın ötesinde, adalet, eşitlik, dogmayı sorgulama, direnebilme kavramları vurgulayan bir başyapıt sayılan eser; Türkiye'de Adana Devlet Tiyatrosu tarafından M.Şekip Taşpınar yönetiminde 2008-2009 sezonunda sahnelenmiştir. Behrengi, bu kitapla dünyanın birçok yerinde tanındı ve sevildi, diğer önemli eseri olan Bir Şeftali Bin Şeftali de Küçük Kara Balık kadar tutulmuştur. Yedi yaş üstü masal kitabı olarak önerilen yapıt, Bratislava ve Bologna Dünya Çocuk Kitapları Fuarlarında ödüller almış , farklı çevirmenler tarafından Türkçeleştirilmiş olup, Türkiye'de ilk basımı 1975 yılında olmuştur. Küçük Kara Balık, Mehmet Sönmez'in çizimleriyle nitelikli bir anlam kazanmış olup, her yaştan okuyucuları tarafından \"Dünyanın en devrimci balığı\" olarak yorumlanmaktadır")
        val book2 = Book("Denizler Altında 20 Bin Fersah","Jules Verne",R.drawable.ic_baseline_grade_24,"")
        val book3 = Book("Şeker Portakalı","José Mauro De Vasconcelos",R.drawable.ic_baseline_grade_24,"")
        val book4 = Book("Tom Sawyer","Mark Twain",R.drawable.ic_baseline_grade_24,"")
        val book5 = Book("Oliver Twist","Charles Dickens",R.drawable.ic_baseline_grade_24,"")
        val book6 = Book("Robinson Crusoe","Daniel Defoe",R.drawable.ic_baseline_grade_24,"")
        val book7 = Book("Peter Pan","J. M. Barrie", R.drawable.ic_baseline_grade_24,"")
        booklist.add(book1)
        booklist.add(book2)
        booklist.add(book3)
        booklist.add(book4)
        booklist.add(book5)
        booklist.add(book6)
        booklist.add(book7)



        //RecyclerView
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = BookAdapter(booklist)
        binding.recyclerView.adapter = adapter


    }
}

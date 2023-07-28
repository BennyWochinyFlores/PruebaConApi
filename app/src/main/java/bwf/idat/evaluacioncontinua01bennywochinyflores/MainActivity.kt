package bwf.idat.evaluacioncontinua01bennywochinyflores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import bwf.idat.evaluacioncontinua01bennywochinyflores.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentview= supportFragmentManager.findFragmentById(R.id.fc_navigation) as NavHostFragment
        val navController= fragmentview.navController
        binding.bnvHome.setupWithNavController(navController)



       //inding.bnvHome.setOnItemSelectedListener {item ->
       //   when(item.itemId){
       //       R.id.navigation_home ->{
       //           binding.txttittle.text ="Menu"
       //           true
       //       }
       //       R.id.navigation_dashboard ->{
       //           binding.txttittle.text ="Libreria"
       //           true
       //       }
       //       R.id.navigation_notifications ->{
       //           binding.txttittle.text ="Yo"
       //           true
       //       }
       //       else ->{
       //           false
       //       }
       //   }
       //

    }
}
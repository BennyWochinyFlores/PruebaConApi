package bwf.idat.evaluacioncontinua01bennywochinyflores.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import bwf.idat.evaluacioncontinua01bennywochinyflores.R
import bwf.idat.evaluacioncontinua01bennywochinyflores.databinding.FragmentNotificationsBinding

class YoFragment : Fragment() {

    private lateinit var binding: FragmentNotificationsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNotificationsBinding.inflate(inflater,container,false)
        return binding.root
    }



}
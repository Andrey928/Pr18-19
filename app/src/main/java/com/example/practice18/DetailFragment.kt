package com.example.practice18

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class DetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    fun setSelectedItem(selectedItem: String?) {
        val view = view?.findViewById<TextView>(R.id.textView2)
        view?.text = selectedItem
        val image = requireView().findViewById<ImageView>(R.id.imageView)
        val ble = R.drawable.bigle
        val mlt = R.drawable.malamut
        val smd = R.drawable.samoed
        if (selectedItem == "Бигль") {
            image.setImageResource(ble)
            view!!.text = "Охотничья порода собак, выведенная в Великобритании."
        }
        if (selectedItem == "Самоед") {
            image.setImageResource(smd)
            view!!.text = "Одна из древнейших пород собак, которая относится к примитивным породам. Происходит с Крайнего Севера Евразии"
        }
        if (selectedItem == "Маламут") {
            image.setImageResource(mlt)
            view!!.text = "Порода ездовых собак аборигенного типа, предназначенная для работы в упряжке, одна из древнейших пород собак"
        }
    }

}
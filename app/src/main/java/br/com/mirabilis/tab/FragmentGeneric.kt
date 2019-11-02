package br.com.mirabilis.tab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment.*

class FragmentGeneric : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater!!.inflate(R.layout.fragment, container, false)

    //tambahan
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args = arguments
        val index = args?.getString("data", "")

        tvIsi.setText(index)

    }


    companion object {
        fun newInstance(): FragmentGeneric = FragmentGeneric()
    }

//    companion object {
//        fun newInstance(data: String): FragmentGeneric {
//            val frag = FragmentGeneric ()
//            // Pass index input as an argument.
//            val args = Bundle()
//            args.putString("data", data)
//
//            frag.setArguments(args)
//            return frag
//        }
//    }

}
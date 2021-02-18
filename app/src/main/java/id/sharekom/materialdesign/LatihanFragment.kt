package id.sharekom.materialdesign

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import id.sharekom.materialdesign.databinding.FragmentLatihanBinding

class LatihanFragment : Fragment() {
    private var _binding: FragmentLatihanBinding? = null
    private val binding get() = _binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentLatihanBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding){

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
package com.bypavelshell.mathcreater.pascalhelp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bypavelshell.mathcreater.pascalhelp.R
import com.bypavelshell.mathcreater.pascalhelp.databinding.SystemPascalAbcNetBinding

class SystemPascalAbcNet : Fragment() {

    private var _binding: SystemPascalAbcNetBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.system_pascal_abc_net, container, false)
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
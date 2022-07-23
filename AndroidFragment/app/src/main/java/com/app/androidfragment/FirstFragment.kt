package com.app.androidfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.app.androidfragment.databinding.FragmentFirstBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstFragment : Fragment() {

    lateinit var binding:FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {

            var name = binding.etName.text.toString().trim()
            var message = binding.etMessage.text.toString().trim()

            var bundle = Bundle()
            bundle.putString("NAME", name)
            bundle.putString("MSG", message)

            // navigate to second fragment
            var fragment = SecondFragment()
            fragment.arguments = bundle
            var manager: FragmentManager = requireActivity().supportFragmentManager
            var transaction: FragmentTransaction = manager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.addToBackStack(null)
            transaction.commit()

          /*  requireActivity().supportFragmentManager.beginTransaction().apply {
                add()
                addToBackStack()
                commit()
            }*/

        }

    }

}
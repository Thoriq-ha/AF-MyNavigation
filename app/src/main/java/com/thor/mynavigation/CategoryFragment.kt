package com.thor.mynavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.thor.mynavigation.databinding.FragmentCategoryBinding

class CategoryFragment : Fragment() {

    private var _binding: FragmentCategoryBinding? = null
    private val binding get() = _binding!!

//    companion object {
//        const val EXTRA_NAME = "extra_name"
//        const val EXTRA_STOCK = "extra_stock"
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentCategoryBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnCategoryLifestyle.setOnClickListener {
            /*          NOTED
                Using safeArgs to sending data more safety*/
            val toDetailCategoryFragment =
                CategoryFragmentDirections.actionCategoryFragmentToDetailCategoryFragment()
            toDetailCategoryFragment.name = "Lifestyle"
            toDetailCategoryFragment.stock = 7
            view.findNavController().navigate(toDetailCategoryFragment)

            /*          NOTED
                Using Bundle to sending data */
//            val mBundle = Bundle()
//            mBundle.putString(EXTRA_NAME, "Lifestyle")
//            mBundle.putLong(EXTRA_STOCK, 7)
//            view.findNavController()
//                .navigate(R.id.action_categoryFragment_to_detailCategoryFragment, mBundle)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
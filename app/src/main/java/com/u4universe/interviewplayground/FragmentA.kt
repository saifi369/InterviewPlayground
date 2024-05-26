package com.u4universe.interviewplayground

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class FragmentA : Fragment() {

  override fun onAttach(context: Context) {
    super.onAttach(context)
    Log.d(TAG, "Fragment onAttach: Called")
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    Log.d(TAG, "Fragment onCreate: Called")
  }

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    // Inflate the layout for this fragment
    Log.d(TAG, "Fragment onCreateView: Called")
    return inflater.inflate(R.layout.fragment_a, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    Log.d(TAG, "Fragment onViewCreated: Called")
  }

  override fun onStart() {
    super.onStart()
    Log.d(TAG, "Fragment onStart: Called")
  }

  override fun onResume() {
    super.onResume()
    Log.d(TAG, "Fragment onResume: Called")
  }

  override fun onPause() {
    super.onPause()
    Log.d(TAG, "Fragment onPause: Called")
  }

  override fun onStop() {
    super.onStop()
    Log.d(TAG, "Fragment onStop: Called")
  }

  override fun onDestroyView() {
    super.onDestroyView()
    Log.d(TAG, "Fragment onDestroyView: Called")
  }

  override fun onDestroy() {
    super.onDestroy()
    Log.d(TAG, "Fragment onDestroy: Called")
  }

  override fun onDetach() {
    super.onDetach()
    Log.d(TAG, "Fragment onDetach: Called")
  }
}
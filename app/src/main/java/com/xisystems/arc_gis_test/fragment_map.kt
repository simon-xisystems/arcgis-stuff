package com.xisystems.arc_gis_test


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.esri.arcgisruntime.mapping.ArcGISMap
import com.esri.arcgisruntime.mapping.Basemap
import kotlinx.android.synthetic.main.fragment_fragment_map.*

/**
 * A simple [Fragment] subclass.
 */
class fragment_map : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_map, container, false)
             }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // create a map with the BasemapType topographic
        val map = ArcGISMap(Basemap.Type.TOPOGRAPHIC, 34.056295, -117.195800, 16)

        // set the map to be displayed in the layout's MapView
        mapView.map = map



        }



}





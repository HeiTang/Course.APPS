package com.example.lab4;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import android.view.View;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(24.178817, 120.646691);
        mMap.addMarker(new MarkerOptions().position(sydney).title("逢甲大學"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(12));

        // mMap.getUiSettings().setZoomControlsEnabled(true);
        // mMap.getUiSettings().setCompassEnabled(true);
        // mMap.getUiSettings().setMapToolbarEnabled(true);

        // mMap.animateCamera(CameraUpdateFactory.zoomTo(16));
    }

    int c=0;

    public void button(View v) {
        c++;
        int count = c % 4;
        if(count == 0){
            mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        }
        else if (count == 1){
            mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        }
        else if (count == 2){
            mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        }
        else if (count == 3){
            mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
        }
    }
}

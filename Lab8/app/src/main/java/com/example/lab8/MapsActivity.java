package com.example.lab8;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    static final LatLng LONDON=new LatLng(51.519029,-0.130094);
    Button start,stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        start = (Button)findViewById(R.id.btn_start);
        stop = (Button)findViewById(R.id.btn_stop);
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

        final CameraPosition cameraPosition = new CameraPosition.Builder().target(LONDON).zoom(8).build();
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 2000, new GoogleMap.CancelableCallback() {
                    @Override
                    public void onFinish() {
                        Log.d("Map","Animation finished");
                    }

                    @Override
                    public void onCancel() {
                        Log.d("Map","Animation interruted");
                    }
                });
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMap.stopAnimation();
            }
        });
    }
}

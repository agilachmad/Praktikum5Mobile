package com.maps.praktikummodul5;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Sekolah extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

//        LatLng Bangkalan = new LatLng(-7.045895, 112.739970);
//        mMap.addMarker(new MarkerOptions().position(Bangkalan).title("Ini Adalah Rumah Saya").snippet("Jawa Timur"));
//        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Bangkalan, 15));

        LatLng SMAN2 = new LatLng(-7.046729, 112.735252);
        mMap.addMarker(new MarkerOptions().position(SMAN2).title("Ini Adalah SMA NEGERI 2 BANGKALAN").snippet("Jawa Timur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(SMAN2, 15));
        LatLng SMAN1 = new LatLng(-7.029730, 112.759020);
        mMap.addMarker(new MarkerOptions().position(SMAN1).title("Ini Adalah SMA NEGERI 1 BANGKALAN").snippet("Jawa Timur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(SMAN1, 15));
        LatLng SMPN2 = new LatLng(-7.027351, 112.745699);
        mMap.addMarker(new MarkerOptions().position(SMPN2).title("Ini Adalah SMP NEGERI 2 BANGKALAN").snippet("Jawa Timur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(SMPN2, 15));
        LatLng SMPN1 = new LatLng(-7.025362, 112.751398);
        mMap.addMarker(new MarkerOptions().position(SMPN1).title("Ini Adalah SMP NEGERI 1 BANGKALAN").snippet("Jawa Timur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(SMPN1, 15));
        LatLng SDM1 = new LatLng(-7.031120, 112.746108);
        mMap.addMarker(new MarkerOptions().position(SDM1).title("Ini Adalah SD MUHAMMADIYAH 1 BANGKALAN").snippet("Jawa Timur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(SDM1, 15));
        LatLng SDK1 = new LatLng(-7.041470, 112.739469);
        mMap.addMarker(new MarkerOptions().position(SDK1).title("Ini Adalah SD KEMAYORAN 1 BANGKALAN").snippet("Jawa Timur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(SDK1, 15));


    }
}

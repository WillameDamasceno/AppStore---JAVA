package com.example.willstore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationBarView;

public class TelaSobreActivity extends AppCompatActivity {
    private NavigationBarView menuNav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_sobre);

        menuNav = findViewById(R.id.nav);

        menuNav.setSelectedItemId(R.id.menu);

        menuNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        return true;

                    case R.id.contatos:
                        startActivity(new Intent(getApplicationContext(), TelaContatoActivity.class));
//                        overridePendingTransition(0, 0);
                        return true;


                    case R.id.sobre:
                        startActivity(new Intent(getApplicationContext(), TelaSobreActivity.class));
//                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });
    }
}
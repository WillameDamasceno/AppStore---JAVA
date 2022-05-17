package com.example.willstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DescActivity extends AppCompatActivity {
    private TextView tv_desc, tv_preco, tv_DescProduto;
    private ImageView img_monitor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc);
        Bundle bundle = getIntent().getExtras();
        MyEquipGamer myEquipGamer =(MyEquipGamer) bundle.getSerializable("produto");
        tv_desc = findViewById(R.id.tv_desc);
        tv_preco = findViewById(R.id.tv_preco);
        tv_DescProduto = findViewById(R.id.tv_DescProduto);
        img_monitor = findViewById(R.id.img_monitor);

        tv_desc.setText(myEquipGamer.getTextDesc());
        tv_preco.setText(myEquipGamer.getTextPreco());
        tv_DescProduto.setText(myEquipGamer.gettextDescProduto());
        img_monitor.setImageResource(myEquipGamer.getGamerImg());
    }
}
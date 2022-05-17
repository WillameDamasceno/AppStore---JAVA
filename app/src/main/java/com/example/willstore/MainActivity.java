package com.example.willstore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private NavigationBarView menuNav;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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

        RecyclerView recyclerView = findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setHasFixedSize(true);

        ArrayList<MyEquipGamer> arr = new ArrayList<>();

        arr.add(new MyEquipGamer("Monitor Gamer", "R$ 300, 00","Monitor de jogos Full HD (1920 x 1080) de 27 polegadas com taxa de atualização ultrarrápida de 165 Hz projetado para jogadores profissionais e jogabilidade envolvente. A tecnologia ASUS Extreme Low Motion Blur (ELMB ?) permite um tempo de resposta de 1 ms (MPRT), eliminando fantasmas para visuais nítidos de jogos.",R.drawable.monitorgamer));
        arr.add(new MyEquipGamer("Teclado Gamer", "R$ 400, 00","O T-Dagger Bora RGB traz tudo que um teclado mecânico deve ter: um RGB encantador, Switches de confiança, teclas que não desgastam e um prazer de uso absoluto! Inclui iluminação RGB individual por tecla que pode ser customizada tanto diretamente no teclado ou pelo software. O design elegante com as teclas flutuantes trazem estilo ao Bora sem comprometer a estética minimalista. O Bora também é de fácil transporte devido ao seu cabo removível.", R.drawable.tecladogamaer));
        arr.add(new MyEquipGamer("Mouse Gamer", "R$ 500, 00","Mouse Gamer Razer Deathadder V2 Chroma Veja com seus pró;prios olhos o renascimento de um ícone com o Razer DeathAdder V2, um mouse ergonômico projetado com curvas mortais e linhas agressivas, uma arma que se manuseia como nenhuma outra.  um mouse ergonômico projetado com curvas mortais e linhas agressivas, uma arma que se manuseia como nenhuma outra.  um mouse ergonômico projetado com curvas mortais e linhas agressivas, uma arma que se manuseia como nenhuma outra. ", R.drawable.mousegamer));
        arr.add(new MyEquipGamer("MousePad Gamer", "R$ 600, 00","Mais espaço de ação Com o Mousepad Gamer Husky Gaming Avalanche Control, Black, Grande, você possui um amplo espaço de ação Grande de 450 por 400 mm em um tecido de microfibra de alta densidade que permite a completa fluidez de movimentos e muito mais velocidade para seu mouse.Mais espaço de ação Com o Mousepad Gamer Husky Gaming Avalanche Control, Black, Grande, você possui um amplo espaço de ação Grande de 450 por 400 mm em um tecido de microfibra.", R.drawable.mousepad));
        arr.add(new MyEquipGamer("PC Gamer", "R$ 700, 00","PC Gamer Skul 5000 I5-10400F, Geforce GTX 1650, 8GB DDR4, SSD 240GB, 600W PLUS WHITE, Linux  Com Memória RAM 8GB DDR4 uma configuração focada em colecionar vitórias, a linha de computadores Gamer é ideal para quem busca desempenho, velocidade e qualidade de imagem em seus jogos! Com componentes potentes, desde a fonte até o processador e a placa de vídeo GTX 1650 4GB, esse sem dúvida é o arsenal que você precisa para conquistar o universo dos games.", R.drawable.pc));
        arr.add(new MyEquipGamer("Cadeira Gamer", "R$ 800, 00","A TGC12 ThunderX3 é uma cadeira gamer com revestimento de couro coberta com costuras de fibra de carbono. Seu estofado é em forma de diamantes construída com firmeza para proporcionar conforto enquanto você desfruta do prazer de jogar seus games favoritos. Da sala de estar para a sala de jogos, você pode planejar a próxima dominação do mundo do conforto de sua cadeira gamer. Da sala de estar para a sala de jogos, você pode planejar a próxima dominação do mundo do conforto de sua cadeira gamer.", R.drawable.cadeira));
        arr.add(new MyEquipGamer("Mesa Gamer", "R$ 900, 00","Superfície em fibra de carbono Aparência texturizada e toque suave, é resistente a riscos e à prova de umidade e suor. Mesa Gamer Husky Gaming Snow conta com organizador de fios para manter seu setup gamer mais clean e organizado.Superfície em fibra de carbono Aparência texturizada e toque suave, é resistente a riscos e à prova de umidade e suor. Mesa Gamer Husky Gaming Snow conta com organizador de fios para manter seu setup gamer mais clean e organizado.",R.drawable.mesa));

        MyAdapter myAdapter = new MyAdapter(arr, getApplicationContext());
        recyclerView.setAdapter(myAdapter);
    }
}
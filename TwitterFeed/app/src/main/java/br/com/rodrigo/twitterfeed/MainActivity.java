package br.com.rodrigo.twitterfeed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

import br.com.rodrigo.twitterfeed.Adapter.FeedAdapter;
import br.com.rodrigo.twitterfeed.Model.Feed;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Feed> feedArrayList = new ArrayList<>();
    private FeedAdapter feedAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycleViewMain);
        DividerItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Feed postagem1 = new Feed();
        postagem1.setHoraPostagem("1h");
        postagem1.setNomeUsuario("Gasparzinho");
        postagem1.setUserLoginName("@usuarioFantasma");
        postagem1.setTextoFeed("Ficou legal a lista, estou só testando para ver se o layout está funcionando direito.");


        Feed postagem2 = new Feed();
        postagem2.setHoraPostagem("4h");
        postagem2.setNomeUsuario("Rodrigo Boza");
        postagem2.setUserLoginName("@rodrigoBozaPontes");
        postagem2.setTextoFeed("Parece estar tudo funcionando de boas!");


        Feed postagem3 = new Feed();
        postagem3.setHoraPostagem("2d");
        postagem3.setNomeUsuario("Naruto é Ruim");
        postagem3.setUserLoginName("@tenten");
        postagem3.setTextoFeed("Isso não é muito legal, é qualquer coisa aqui só pra testar aqui essa lista");


        feedArrayList.add(postagem1);
        feedArrayList.add(postagem2);
        feedArrayList.add(postagem3);


        feedAdapter = new FeedAdapter(feedArrayList, this);
        recyclerView.setAdapter(feedAdapter);
    }
}

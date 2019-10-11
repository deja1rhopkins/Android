package com.example.pamrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class Aluno {

    private String nome;
    private Integer idade;

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.nossoRecycleView);

        List<Aluno> listAlunos = new ArrayList<>();
        Aluno huguinho = new Aluno();
        huguinho.setNome("huguinho");
        huguinho.setIdade(10);

        Aluno zezinho = new Aluno();
        zezinho.setNome("zezinho");
        zezinho.setIdade(9);

        Aluno luizinho = new Aluno();
        luizinho.setNome("luizinho");
        luizinho.setIdade(8);

        listAlunos.add(huguinho);
        listAlunos.add(zezinho);
        listAlunos.add(luizinho);

        recyclerView.setAdapter(new NossoRecicleViewListDeAlunosAdapter(listAlunos, this));

        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);
    }
}
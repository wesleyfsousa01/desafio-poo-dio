package br.com.dio.desafio.dominio;

import java.time.LocalDate;

import static br.com.dio.desafio.dominio.Conteudo.XP_PADRAO;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }



    @Override
    public double calcularXp(){
        return XP_PADRAO;
    }


}

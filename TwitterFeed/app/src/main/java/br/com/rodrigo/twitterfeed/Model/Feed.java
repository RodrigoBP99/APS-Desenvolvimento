package br.com.rodrigo.twitterfeed.Model;

import android.media.Image;

public class Feed {
    private String nomeUsuario;
    private Image imagePerfil;
    private String userLoginName;
    private String textoFeed;
    private String horaPostagem;

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public Image getImagePerfil() {
        return imagePerfil;
    }

    public void setImagePerfil(Image imagePerfil) {
        this.imagePerfil = imagePerfil;
    }

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }

    public String getTextoFeed() {
        return textoFeed;
    }

    public void setTextoFeed(String textoFeed) {
        this.textoFeed = textoFeed;
    }

    public String getHoraPostagem() {
        return horaPostagem;
    }

    public void setHoraPostagem(String horaPostagem) {
        this.horaPostagem = horaPostagem;
    }
}

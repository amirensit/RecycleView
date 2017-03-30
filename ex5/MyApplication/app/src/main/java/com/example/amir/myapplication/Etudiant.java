package com.example.amir.myapplication;



public class Etudiant {
    private String nom,email;
    private int abs;
    private int pic;
    public Etudiant(String nom,String email,int abs,int pic)
    {
        this.nom=nom;
        this.email=email;
        this.abs=abs;
        this.pic=pic;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAbs() {
        return abs;
    }

    public void setAbs(int abs) {
        this.abs = abs;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}

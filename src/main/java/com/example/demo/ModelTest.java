package com.example.demo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "klient")
public class ModelTest {
    private String id;
    private String modeli;
    private String targa;

    public ModelTest(String id, String modeli, String targa) {
        this.id = id;
        this.modeli = modeli;
        this.targa = targa;
    }

    public ModelTest(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModeli() {
        return modeli;
    }

    public void setModeli(String modeli) {
        this.modeli = modeli;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }
}

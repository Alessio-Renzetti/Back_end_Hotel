package com.example.demo.Entity_hotel;

import jakarta.persistence.*;

@Entity
@Table(name="prenotazione_camera")
public class PrenotazioneCamera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prenotazione_camera")
    private Integer idPrenotazioneCamera;

    @ManyToOne
    @JoinColumn(name = "FK_camera")
    private Camera camera;

    @ManyToOne
    @JoinColumn(name = "FK_prenotazione")
    private Prenotazione prenotazione;

    @Column(name = "n_ospiti")
    private Integer n_ospiti;

    public Integer getIdPrenotazioneCamera() {
        return idPrenotazioneCamera;
    }

    public void setIdPrenotazioneCamera(Integer idPrenotazioneCamera) {
        this.idPrenotazioneCamera = idPrenotazioneCamera;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public Prenotazione getPrenotazione() {
        return prenotazione;
    }

    public void setPrenotazione(Prenotazione prenotazione) {
        this.prenotazione = prenotazione;
    }

    public Integer getN_ospiti() {
        return n_ospiti;
    }

    public void setN_ospiti(Integer n_ospiti) {
        this.n_ospiti = n_ospiti;
    }
}

package classes.interfaces;

public interface Interface {
    int IDADEMINIMA = 18;
    int TEMPOMAXUSO = 30;
    
    void getIDADEMINIMA();
    void getTEMPOMAXUSO();
    void acelerar(int indice);
    void desacelerar(int indice);
    void frear(int indice);
    void virarDireita(int indice);
    void virarEsquerda(int indice);
}

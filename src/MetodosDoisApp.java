public class MetodosDoisApp {
    public static void main(String[] args) {
        // criacao de classe para personificar interacao de metodo.
        MetodosDois metodosDois = new MetodosDois();

        System.out.println("TV esta ligada? " + metodosDois.isOn);
        System.out.println("A TV está no canal: " + metodosDois.canal);
        System.out.println("Volume esta em: " + metodosDois.volume);

        metodosDois.desligar();
        System.out.println("TV esta ligada? " + metodosDois.isOn);
    };
}

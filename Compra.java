package Classes;

public  class Compra {
    public boolean realizarCompra(Usuario user, Evento evento,String assento,Cartao cartao) {
        Ingresso ingresso = new Ingresso(evento, 100.0f, assento);
        user.addIngresso(ingresso);
        evento.alterarAssento(assento, false);
        String emailUser = user.getEmail();
        System.out.println("Um email com uma cópia do ingresso foi enviado para: " + emailUser);
        return true;
    }
    public void cancelarCompra(Usuario user, Ingresso ingresso){
        user.getIngressos().remove(ingresso);
        String assento = ingresso.getAssento();
        ingresso.getEvento().alterarAssento(assento,true);
    }
}
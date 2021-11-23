package br.com.mike.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        //criar instância do EntityManagerFactory (fábrica de objetos EntityManager), que podemos usar para persistir,
        //pesquisar, deletar, todas operações do db podemos usar através dos EntityManager. E para criar os EntityManager, precisamos do
        //EntityManagerFactory

        //O EntityManagerFactory é um objeto "pesado", consome muitos recursos, por isso não é bom usar muito. Além disso, é bom usar o close
        //para liberar os recursos.

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Default");

        emf.close();

    }
}

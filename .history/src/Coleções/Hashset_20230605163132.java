package Coleções;

import java.util.HashSet;
import java.util.Set;

public class Hashset {

    public static void main(String[] args) {

        Set<Pessoa> pessoas = new HashSet<Pessoa>();

        Pessoa joao = new Pessoa("joao", 18);

        pessoas.add(joao);

    }

}

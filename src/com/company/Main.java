package com.company;

import com.company.models.Gerente;

public class Main {

    public static void main(String[] args) {
	Gerente gerente = new Gerente("joão", "da Silva", "123456789", "joao@email.com", "123", 2000.00, 0);

        System.out.println(gerente.pagamento());
    }
}

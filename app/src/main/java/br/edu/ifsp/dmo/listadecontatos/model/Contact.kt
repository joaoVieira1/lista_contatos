package br.edu.ifsp.dmo.listadecontatos.model

import java.io.Serializable

class Contact(val name: String, val phone: String): Serializable {

    override fun toString(): String {
        return "Contato{name: '${name}', phone: '${phone}'}"
    }

}
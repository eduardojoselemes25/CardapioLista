package com.eduardo.cardapiolista

import androidx.appcompat.app.AppCompatActivity
        import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                /* Criando os itens para ser apresentados na lista */
                val lanche1 = Lanche(1, "Lanche do Freguês", "Escolha no maximo 5 ingredientes")
                val lanche2 = Lanche(2, "4 Queijos", "Molho,mussarela,parmesão,provolone e catupiry")
                val lanche3 = Lanche(3, "5 Queijos", "Molho,mussarela,parmesão,provolone, gorgonzola e catupiry")
                val lanche4 = Lanche(4, "6 queijos", "Molho,mussarela,parmesão,provolone,catupiry e cheeder")
                val lanche5 = Lanche(5, "A moda da casa", "Molho,mussarela,presunto,palmito,ovo,milho,ervilha,cebola")
                val lanche6 = Lanche(6, "A parmegiana", "Mussarela coberta c/molho especial,salpicado c/ parmesão")
                val lanche7 = Lanche(7, "Aliche", "Molho,mussarela e aliche")
                val lanche8 = Lanche(8, "xSalada", "Alface, tomate, cebola, ovo, tempero")
                val lanche9 = Lanche(9, "xSalada", "Alface, tomate, cebola, ovo, tempero")
                val lanche10 = Lanche(10, "xSalada Simples", "Alface, tomate, cebola, ovo, tempero")
                val lanche11 = Lanche(11, "xSalada", "Alface, tomate, cebola, ovo, tempero")
                val lanche12 = Lanche(12, "xSalada", "Alface, tomate, cebola, ovo, tempero")
                val lanche13 = Lanche(13, "xSalada", "Alface, tomate, cebola, ovo, tempero")
                val lanche14 = Lanche(14, "xSalada", "Alface, tomate, cebola, ovo, tempero")
                val lanche15 = Lanche(15, "xSalada Simples", "Alface, tomate, cebola, ovo, tempero")
                val lanche16 = Lanche(16, "xSalada", "Alface, tomate, cebola, ovo, tempero")
                val lanche17 = Lanche(17, "xSalada", "Alface, tomate, cebola, ovo, tempero")
                val lanche18 = Lanche(18, "xSalada", "Alface, tomate, cebola, ovo, tempero")
                val lanche19 = Lanche(19, "xSalada Simples", "Alface, tomate, cebola, ovo, tempero")
                val lanche20 = Lanche(20, "xSalada", "Alface, tomate, cebola, ovo, tempero")
                val lanche21 = Lanche(21, "xSalada", "Alface, tomate, cebola, ovo, tempero")
                val lanche22 = Lanche(22, "xSalada", "Alface, tomate, cebola, ovo, tempero")
                val lanche23 = Lanche(23, "xSalada", "Alface, tomate, cebola, ovo, tempero")
                val lanche24 = Lanche(24, "xSalada", "Alface, tomate, cebola, ovo, tempero")
                val lanche25 = Lanche(25, "xSalada", "Alface, tomate, cebola, ovo, tempero")

                /* Definindo os itens que devem ser apresentados na lista */
                val listaLanches = listOf(lanche1, lanche2, lanche3, lanche4, lanche5, lanche6, lanche7, lanche8, lanche9, lanche10
                    , lanche11, lanche12, lanche13, lanche14, lanche15, lanche16, lanche17, lanche18, lanche19, lanche20
                    , lanche21, lanche22, lanche23, lanche24, lanche25)

                val adapter = ItemAdapter(this, listaLanches)

                lista.adapter = adapter
    }
}
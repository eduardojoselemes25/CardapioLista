package com.eduardo.cardapiolista

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.item_lanche.view.*

class ItemAdapter(private val mContext: Context, private val listaLanches: List<Lanche>) : ArrayAdapter<Lanche>(mContext, 0, listaLanches) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(mContext).inflate(R.layout.item_lanche, parent, false)
        val lanche = listaLanches[position]

        layout.tvItem_number.text = lanche.id.toString()
        layout.tvItem_nome.text = lanche.nome
        layout.tvItem_ingredientes.text = lanche.ingredientes

        return layout
    }


}
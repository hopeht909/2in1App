package com.example.a2in1app

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class gameAdapter(private val context: Context, private val messages: ArrayList<String>): RecyclerView.Adapter<gameAdapter.MessageViewHolder>() {
    class MessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private var tvMessage = itemView.findViewById<TextView>(R.id.tvMessage)

        fun bind(message: String) {
            tvMessage.text = message
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        return MessageViewHolder(

            LayoutInflater.from(context).inflate(

                R.layout.item_game_row,

                parent,

                false

            )

        )
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val message = messages[position]

        holder.bind(message)
    }

    override fun getItemCount()= messages.size
}
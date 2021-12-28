package com.beyzaakkuzu.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.beyzaakkuzu.recyclerview.databinding.ListItemBinding


class BookAdapter(val booklist : ArrayList<Book>) : RecyclerView.Adapter<BookAdapter.BookHolder>() {


    class BookHolder(val binding : ListItemBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookHolder {

        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return BookHolder(binding)
    }

    override fun onBindViewHolder(holder: BookHolder, position: Int) {
        holder.binding.bookName.text= booklist.get(position).book_name
        holder.binding.bookAuthor.text= booklist.get(position).book_author

    }
    override fun getItemCount(): Int {
        return booklist.size
    }
}
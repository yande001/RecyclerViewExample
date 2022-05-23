package com.example.darren.recyclerviewexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.darren.recyclerviewexample.databinding.RecyclerviewItemBinding

class MainAdapter(val tasklist: List<Task>): RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
    inner class MainViewHolder(val itemBinding: RecyclerviewItemBinding)
        :RecyclerView.ViewHolder(itemBinding.root){
            fun bindItem(task: Task){
                itemBinding.tvTitle.text = task.title
                itemBinding.tvTime.text = task.timeStamp
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(RecyclerviewItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val task = tasklist[position]
        holder.bindItem(task)
    }

    override fun getItemCount(): Int {
        return tasklist.size
    }
}
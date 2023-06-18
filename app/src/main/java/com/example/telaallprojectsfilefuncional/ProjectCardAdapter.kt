package com.example.telaallprojectsfilefuncional

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.telaallprojectsfilefuncional.databinding.ProjectCardAdapterBinding
import com.example.telaallprojectsfilefuncional.models.projectCard


class ProjectCardAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private var projectCards: List<projectCard> = ArrayList()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectCardViewHolder {
        return ProjectCardViewHolder(
            ProjectCardAdapterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is ProjectCardViewHolder -> {
                holder.bind( projectCards[position] )
            }
        }
    }


    override fun getItemCount(): Int {
        return projectCards.size
    }

    fun setDataset(projectsData: List<projectCard>){
        this.projectCards = projectsData
    }


    class ProjectCardViewHolder(
        itemView: ProjectCardAdapterBinding
    ) : RecyclerView.ViewHolder(itemView.root) {

        /*private val projectCard = itemView.ProjectCard*/
        /*private val projectImage = itemView.ProjectImage*/
        private val projectTitle = itemView.ProjectTitle
        private val projectDate = itemView.ProjectDate

        fun bind (projectCardObject : projectCard) {
            /*projectCard.*/
            /*projectImage.*/
            projectTitle.text = projectCardObject.title
            projectDate.text = projectCardObject.date
        }
    }

}
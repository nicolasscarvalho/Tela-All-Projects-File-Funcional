package com.example.telaallprojectsfilefuncional

import com.example.telaallprojectsfilefuncional.models.projectCard
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.ktx.storage

class DataSource {

    companion object {
        fun generateAllProjectsDataset() : ArrayList<projectCard> {

            val projects = ArrayList<projectCard>()

            projects.add(
                projectCard(
                    cardImageURL = "@drawable/projeto1",
                    title = "Meu projeto 1",
                    date = "Criado em 01/03/2023"
                )
            )

            projects.add(
                projectCard(
                    cardImageURL = "@drawable/projeto2",
                    title = "Meu projeto 2",
                    date = "Criado em 02/03/2023"
                )
            )

            projects.add(
                projectCard(
                    cardImageURL = "@drawable/projeto3",
                    title = "Meu projeto 3",
                    date = "Criado em 03/03/2023"
                )
            )

            projects.add(
                projectCard(
                    cardImageURL = "@drawable/projeto1",
                    title = "Meu projeto 4",
                    date = "Criado em 04/03/2023"
                )
            )

            projects.add(
                projectCard(
                    cardImageURL = "@drawable/projeto2",
                    title = "Meu projeto 5",
                    date = "Criado em 05/03/2023"
                )
            )

            return projects

        }
    }

}
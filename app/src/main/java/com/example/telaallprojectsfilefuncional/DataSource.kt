package com.example.telaallprojectsfilefuncional

import android.content.ContentValues.TAG
import android.util.Log
import com.example.telaallprojectsfilefuncional.models.projectCard
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase


class DataSource (){

    companion object {

//        private lateinit var database: DatabaseReference

        fun generateAllProjectsDataset() : ArrayList<projectCard> {

            val projects = ArrayList<projectCard>()


            val database = Firebase.database
            val myRef = database.getReference("all_projects_data")


            val postListener = object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    // Get Post object and use the values to update the UI

                    dataSnapshot.children.forEach{

//                        val projectHashString = it.value.toString()
//                        val projectHash = projectHashString
//                            .replace("{", "")
//                            .replace("}", "")
//                            .split(", ")
//                            .map { it.split("=") }
//                            .map { it.first() to it.last().toString() }
//                            .toMap()
//
//
//                        projects.add(projectCard(
//                            projectHash.getValue("cardImage") ,
//                            projectHash.getValue("title"),
//                            projectHash.getValue("date")
//                        ))



                        val project = it.getValue(projectCard::class.java)
                        projects.add(project!!)


                    }
                }

                override fun onCancelled(databaseError: DatabaseError) {
                    // Getting Post failed, log a message
                    Log.w(TAG, "loadPost:onCancelled", databaseError.toException())
                }
            }

            myRef.addValueEventListener(postListener)







/*
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
            )*/


            return projects

        }
    }

}
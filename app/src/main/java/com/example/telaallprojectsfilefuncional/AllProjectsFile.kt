package com.example.telaallprojectsfilefuncional

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.telaallprojectsfilefuncional.databinding.ActivityAllProjectsFileBinding

class AllProjectsFile : AppCompatActivity() {

    private lateinit var binding: ActivityAllProjectsFileBinding
    private lateinit var ProjectCardAdapter: ProjectCardAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAllProjectsFileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecycleView()
        addAllProjectsDatasource()

    }

    private fun initRecycleView() {
        this.ProjectCardAdapter = ProjectCardAdapter()

        binding.AllProjectsRecycleView.layoutManager = LinearLayoutManager(this)
        binding.AllProjectsRecycleView.adapter = this.ProjectCardAdapter
    }

    private fun addAllProjectsDatasource() {
        val allProjectsSourceData = DataSource.generateAllProjectsDataset()
        this.ProjectCardAdapter.setDataset(allProjectsSourceData)
    }
}
package com.example.plugins.services

import com.intellij.openapi.project.Project
import com.example.plugins.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

package com.github.ahuang0107.buildyourownintellijplatformplugin.services

import com.intellij.openapi.project.Project
import com.github.ahuang0107.buildyourownintellijplatformplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

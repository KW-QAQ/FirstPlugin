package com.github.kwqaq.firstplugin.services

import com.intellij.openapi.project.Project
import com.github.kwqaq.firstplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

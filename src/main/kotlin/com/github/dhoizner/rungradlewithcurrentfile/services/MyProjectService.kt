package com.github.dhoizner.rungradlewithcurrentfile.services

import com.github.dhoizner.rungradlewithcurrentfile.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

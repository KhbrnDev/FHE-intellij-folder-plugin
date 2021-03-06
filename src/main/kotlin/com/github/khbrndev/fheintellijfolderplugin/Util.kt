package com.github.khbrndev.fheintellijfolderplugin

import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManager

class Util {
    companion object {
        fun getCurrentProject(): Project? {
            val projects = ProjectManager.getInstance().openProjects
            return if (projects.isNotEmpty()) projects[0] else null
        }

    }

}
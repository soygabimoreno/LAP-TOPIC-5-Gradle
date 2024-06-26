package soy.gabimoreno.laptopic5gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

open class CustomTask : DefaultTask() {

    @TaskAction
    fun bye() {
        println("¡1 abrazote!")
    }
}

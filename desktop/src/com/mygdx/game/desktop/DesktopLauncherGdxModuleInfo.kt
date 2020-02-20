package com.mygdx.game.desktop

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.mygdx.game.ModuleInfoSample
import com.mygdx.game.MyGdxGame


fun main() {
    println("app= ${Gdx.app}")
    println("input ${Gdx.input}")

    LwjglApplication(ModuleInfoSample(), LwjglApplicationConfiguration())

    println("app= ${Gdx.app}")
    println("input ${Gdx.input}")
}
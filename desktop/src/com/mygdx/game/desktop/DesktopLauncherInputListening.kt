package com.mygdx.game.desktop

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.mygdx.game.InputListeningSample
import com.mygdx.game.InputPollingSample
import com.mygdx.game.MyGdxGame


fun main() {
    val config = LwjglApplicationConfiguration()
    config.width = 1080
    config.height = 720
    LwjglApplication(InputListeningSample(), config)
}
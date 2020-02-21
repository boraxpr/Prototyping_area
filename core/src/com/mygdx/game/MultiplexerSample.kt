package com.mygdx.game

import com.badlogic.gdx.*

class MultiplexerSample : ApplicationAdapter() {

    companion object {
        @JvmStatic
        private var log = com.mygdx.game.utils.logger<MultiplexerSample>()
    }

    override fun create() {
        Gdx.app.logLevel = Application.LOG_DEBUG

//        val multiplexer = InputMultiplexer()

        //annonymous inner class
        val firstProcessor = object : InputAdapter() {
            override fun keyDown(keycode: Int): Boolean {
                log.debug("first keyDown keycode= $keycode")
                return true
            }

            override fun keyUp(keycode: Int): Boolean {
                log.debug("first keyUp keycode= $keycode")
                return false
            }
        }

        val secondProcessor = object : InputAdapter() {
            override fun keyDown(keycode: Int): Boolean {
                log.debug("second keyDown keycode= $keycode")
                return true
            }

            override fun keyUp(keycode: Int): Boolean {
                log.debug("second keyUp keycode= $keycode")
                return false
            }
        }

//        multiplexer.addProcessor(firstProcessor)
//        multiplexer.addProcessor(secondProcessor)

        Gdx.input.inputProcessor = InputMultiplexer(firstProcessor, secondProcessor)
    }
}
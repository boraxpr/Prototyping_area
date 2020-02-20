package com.mygdx.game

import com.badlogic.gdx.Application
import com.badlogic.gdx.ApplicationListener
import com.badlogic.gdx.Gdx

class ApplicationListenerSample: ApplicationListener {

    companion object {
        @JvmStatic
        private var log = com.mygdx.game.utils.logger<ApplicationListenerSample>()
//        private var log = Logger(ApplicationListenerSample::class.java.simpleName, Logger.DEBUG)
    }
    private  var renderInterrupted = true
    override fun create() {
        //use to initialize game and load resources
        Gdx.app.logLevel = Application.LOG_DEBUG
        log.debug("create()")
    }

    override fun resize(width: Int, height: Int) {
        //use to handle setting a new screen size
        log.debug("resize()")
    }

    override fun render() {
        //use to update and render the game elements called 60 frame per seconds
        if (renderInterrupted){
            log.debug("render()")
            renderInterrupted = false
        }
    }

    override fun pause() {
        //use to save game state when it loses focus which does not involved the
        //actual game play being paused unless the developer wants to pause
        log.debug("pause()")
        renderInterrupted=true
    }

    override fun resume() {
        //use to handle the game coming back from being paused and restores game state
        log.debug("resume()")
        renderInterrupted=true
    }

    override fun dispose() {
        //use to free resources and cleanup
        log.debug("dispose()")
    }
}
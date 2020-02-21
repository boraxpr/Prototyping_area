package com.mygdx.game

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Pixmap
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch


class MyGdxGame: ApplicationAdapter(){
    lateinit var batch: SpriteBatch
    lateinit var img: Texture
    var speed = 30f
    var snakeX= 0f
    var snakeY= 0f
    override fun create() {
        batch = SpriteBatch()
        val pixmap200 = Pixmap(Gdx.files.internal("Sprite-0001.jpg"))
        val pixmap100 = Pixmap(50, 50, pixmap200.format)
        pixmap100.drawPixmap(pixmap200,
                0, 0, pixmap200.width, pixmap200.height,
                0, 0, pixmap100.width, pixmap100.height
        )
        img = Texture(pixmap100)
    }
    override fun render() {
        snakeX =+ speed
        Gdx.gl.glClearColor(0F, 0F, 0F,1F)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        batch.begin()
        batch.draw(img,snakeX, snakeY)
        batch.end()
    }

    override fun dispose() {
        batch.dispose()
        img.dispose()
    }
}
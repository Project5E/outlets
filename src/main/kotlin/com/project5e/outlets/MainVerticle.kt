package com.project5e.outlets

import com.project5e.outlets.verticle.ApiVerticle
import com.project5e.outlets.verticle.ExtCoroutineVerticle
import com.project5e.outlets.verticle.GrpcVerticle
import io.vertx.kotlin.coroutines.await

class MainVerticle: ExtCoroutineVerticle() {

    override suspend fun start() {
        listOf(
            ApiVerticle::class.java.name,
            GrpcVerticle::class.java.name
        ).forEach {
            vertx.deployVerticle(it).await()
        }
    }

    override suspend fun stop() {
    }

}
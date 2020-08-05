package com.project5e.outlets.api.impl

import com.project5e.outlets.api.ApiService
import io.vertx.core.Vertx
import io.vertx.kotlin.coroutines.dispatcher
import kotlinx.coroutines.CoroutineScope
import kotlin.coroutines.CoroutineContext

class ApiServiceImpl(private val vertx: Vertx) : ApiService, CoroutineScope {
    override val coroutineContext: CoroutineContext by lazy { vertx.dispatcher() }
}
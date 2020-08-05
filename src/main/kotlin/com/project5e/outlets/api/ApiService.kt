package com.project5e.outlets.api

import com.project5e.outlets.api.impl.ApiServiceImpl
import io.vertx.codegen.annotations.Fluent
import io.vertx.codegen.annotations.GenIgnore
import io.vertx.codegen.annotations.ProxyGen
import io.vertx.codegen.annotations.VertxGen
import io.vertx.core.AsyncResult
import io.vertx.core.Handler
import io.vertx.core.Vertx
import io.vertx.core.json.JsonObject

@ProxyGen
interface ApiService {

    @Fluent
    fun parse(content: String, resultHandler: Handler<AsyncResult<JsonObject>>): ApiService

    @GenIgnore
    companion object {
        @GenIgnore
        fun create(vertx: Vertx): ApiService {
            return ApiServiceImpl(vertx)
        }
        /*
        @GenIgnore
    fun createProxy(vertx: Vertx?, address: String? ): com.project5e.ttp.reactivex.services.db.TtpDbService? {
        return TtpDbService(TtpDbServiceVertxEBProxy(vertx, address))
    }
         */
    }
}
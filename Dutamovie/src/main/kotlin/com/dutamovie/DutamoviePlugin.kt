package com.dutamovie

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class DutamoviePlugin: Plugin() {
    override fun load(context: Context) {
        // All providers should be added in this manner. Please don't edit the providers list directly.
        registerMainAPI(DutaMovie())
        registerExtractorAPI(FilelionsTo())
        registerExtractorAPI(Likessb())
        registerExtractorAPI(DbGdriveplayer())
        registerExtractorAPI(Dutamovie21())
        registerExtractorAPI(Embedwish())
        registerExtractorAPI(Doods())
        registerExtractorAPI(Lylxan())
        registerExtractorAPI(Ghbrisk())
        registerExtractorAPI(FilelionsOn())
        registerExtractorAPI(Kotakajaib())
        registerExtractorAPI(Uplayer())
    }
}

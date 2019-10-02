package io.kweb.plugins.chartJs

import io.kweb.Kweb
import io.kweb.dom.element.creation.tags.canvas
import io.kweb.dom.element.new
import io.kweb.plugins.KwebPlugin
import io.kweb.plugins.chartJs.ChartType.line


class ChartJsPlugin : KwebPlugin() {
    override fun decorate(startHead: StringBuilder, endHead: StringBuilder) {
        startHead.appendln("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.2/Chart.bundle.min.js\"></script>")
    }
}

val chartJs = ChartJsPlugin()


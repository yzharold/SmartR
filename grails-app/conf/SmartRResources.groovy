modules = {
    smartR_base {
        resource url: [plugin: 'smart-r', dir: 'css', file: 'smartR.css']
        resource url: [plugin: 'smart-r', dir: 'js/resource', file: 'jquery-2.1.4.min.js']
        resource url: [plugin: 'smart-r', dir: 'js/resource', file: 'jquery-ui-1.11.4.min.js']
        resource url: [plugin: 'smart-r', dir: 'js/resource', file: 'jquery.tablesorter.min.js']
        resource url: [plugin: 'smart-r', dir: 'js/resource', file: 'd3.min.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR', file: 'smartR.js']
    }

    smartR_heatmap {
        dependsOn 'smartR_base'
        resource url: [plugin: 'smart-r', dir: 'css', file: 'Heatmap.css']
        resource url: [plugin: 'smart-r', dir: 'js/resource', file: 'jsrender.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR', file: 'extjs-helper.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR', file: 'bioMarkersModel.js']

        resource url: [plugin: 'smart-r', dir: 'js/smartR/Heatmap', file: 'heatmapValidator.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/Heatmap', file: 'heatmapService.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/Heatmap', file: 'heatmapView.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/Heatmap', file: 'd3Heatmap.js']
    }

    smartR_correlation {
        resource url: [plugin: 'smart-r', dir: 'js/smartR', file: 'smartRService.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR', file: 'smartRView.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR', file: 'correlationView.js']
    }

    smartR_boxplothack {
        resource url: [plugin: 'smart-r', dir: 'js/smartR', file: 'boxplotHack.js']
        resource url: [plugin: 'smart-r', dir: 'css', file: 'Boxplot.css']
    }
}

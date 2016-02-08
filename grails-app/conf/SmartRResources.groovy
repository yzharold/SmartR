modules = {
    smartR_base {
        resource url: [plugin: 'smart-r', dir: 'css', file: 'smartR.css']
        resource url: [plugin: 'smart-r', dir: 'js/resource', file: 'jquery-2.1.4.min.js']
        resource url: [plugin: 'smart-r', dir: 'js/resource', file: 'jquery-ui-1.11.4.min.js']
        resource url: [plugin: 'smart-r', dir: 'js/resource', file: 'jquery.tablesorter.min.js']
        resource url: [plugin: 'smart-r', dir: 'js/resource', file: 'd3.min.js']
    }

    smartR_heatmap {
        dependsOn 'smartR_base'
        resource url: [plugin: 'smart-r', dir: 'css', file: 'Heatmap.css']
        resource url: [plugin: 'smart-r', dir: 'js/resource', file: 'jsrender.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_common', file: 'analysisInit.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_common', file: 'ajaxServices.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/Heatmap', file: 'd3Heatmap.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_common', file: 'analysisInit.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/Heatmap', file: 'extjs-helper.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/Heatmap', file: 'bioMarkersModel.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/Heatmap', file: 'heatmapValidator.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/Heatmap', file: 'heatmapService.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/Heatmap', file: 'heatmapView.js']
    }

    smartR_analysis_common {
        dependsOn 'smartR_base'
        resource url: [plugin: 'smart-r', dir: 'js/resource', file: 'jsrender.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_common', file: 'analysisInit.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_common', file: 'ajaxServices.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_common/components', file: 'conceptBox.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_common/components', file: 'conceptBoxCollection.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_common/components', file: 'executionStatus.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_common/components', file: 'svgDownload.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_common/components', file: 'runStep.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_common/components', file: 'fetchDataStep.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_common/components', file: 'summaryStats.js']
    }

    smartR_boxplot {
        dependsOn 'smartR_analysis_common'
        resource url: [plugin: 'smart-r', dir: 'css', file: 'Boxplot.css']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/Boxplot', file: 'd3Boxplot.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/Boxplot', file: 'boxplotModel.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/Boxplot', file: 'boxplotController.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/Boxplot', file: 'boxplotView.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/Boxplot', file: 'boxplot.js']
    }

    // Below this point we put only resources that are used by the angular js ported workflows
    // Once we are completely done no code should be above this comment

    smartR_core {
        resource url: [plugin: 'smart-r', dir: 'css', file: 'smartR.css']
        resource url: [plugin: 'smart-r', dir: 'js/resource', file: 'd3.min.js']
        resource url: [plugin: 'smart-r', dir: 'js/resource', file: 'jquery-2.1.4.min.js']
        resource url: [plugin: 'smart-r', dir: 'js/resource', file: 'jquery-ui-1.11.4.min.js']
        resource url: [plugin: 'smart-r', dir: 'js/resource', file: 'jquery.tablesorter.min.js']
    }

    smartR_angular_components {
        dependsOn 'angular'
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular', file: 'smartRApp.js']
        // directives
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/directives', file: 'conceptBox.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/directives', file: 'tabContainer.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/directives', file: 'workflowTab.js']
        // services
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/services', file: 'rServeService.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/services', file: 'smartRUtils.js']
    }

    smartR_correlation {
        dependsOn 'smartR_angular_components', 'smartR_core'
        resource url: [plugin: 'smart-r', dir: 'css', file: 'correlation.css']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/controllers', file: 'correlation.js']
        resource url: [plugin: 'smart-r', dir: 'js/smartR/_angular/viz', file: 'd3Correlation.js']
    }
}

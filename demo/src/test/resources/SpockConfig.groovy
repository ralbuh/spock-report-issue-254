spockReports {
  set 'com.athaydes.spockframework.report.IReportCreator': 'com.athaydes.spockframework.report.template.TemplateReportCreator'
  set 'com.athaydes.spockframework.report.template.TemplateReportCreator.specTemplateFile': '/templates/spec-template.md'
  set 'com.athaydes.spockframework.report.template.TemplateReportCreator.reportFileExtension': 'md'
  set 'com.athaydes.spockframework.report.template.TemplateReportCreator.summaryTemplateFile': '/templates/summary-template.md'
  set 'com.athaydes.spockframework.report.template.TemplateReportCreator.summaryFileName': 'index.md'
  set 'com.athaydes.spockframework.report.outputDir': 'src/main/asciidoc/spock-reports'
  set 'com.athaydes.spockframework.report.hideEmptyBlocks': false
}

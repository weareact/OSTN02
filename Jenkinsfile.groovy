library('common-pipeline')
buildProperties.getPropertyBuilderWithDefaults()
        .emailRecipients('cardiff-dev@weareact.com')
        .jdkVersion('OpenJDK17-Latest')
        .buildAndSet()
sampleScripts.simpleJavaProject(nodeName: 'docker-support', timeout: 80)
sampleScripts.releaseIfMasterOrIfReleaseParameter(nodeName: 'docker-support', timeout: 80)

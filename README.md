# RoomKotlinCrash

Sample project for reproduction of this crash:

```ruby
e: [kapt] An exception occurred: java.lang.NoClassDefFoundError: org/jetbrains/kotlin/serialization/jvm/JvmProtoBufUtil
	at me.eugeniomarletti.kotlin.metadata.KotlinClassMetadata$data$2.invoke(KotlinMetadata.kt:51)
	at me.eugeniomarletti.kotlin.metadata.KotlinClassMetadata$data$2.invoke(KotlinMetadata.kt:50)
	at kotlin.SynchronizedLazyImpl.getValue(Lazy.kt:131)
	at me.eugeniomarletti.kotlin.metadata.KotlinClassMetadata.getData(KotlinMetadata.kt)
	at android.arch.persistence.room.ext.KotlinMetadataProcessor$DefaultImpls.getParameterNames(KotlinMetadataProcessor.kt:33)
	at android.arch.persistence.room.processor.PojoProcessor.getParameterNames(PojoProcessor.kt:73)
	at android.arch.persistence.room.processor.PojoProcessor.getParamNames(PojoProcessor.kt:245)
	at android.arch.persistence.room.processor.PojoProcessor.chooseConstructor(PojoProcessor.kt:263)
	at android.arch.persistence.room.processor.PojoProcessor.doProcess(PojoProcessor.kt:207)
	at android.arch.persistence.room.processor.PojoProcessor.access$doProcess(PojoProcessor.kt:73)
	at android.arch.persistence.room.processor.PojoProcessor$process$1.invoke(PojoProcessor.kt:104)
	at android.arch.persistence.room.processor.PojoProcessor$process$1.invoke(PojoProcessor.kt:73)
	at android.arch.persistence.room.processor.cache.Cache$Bucket.get(Cache.kt:46)
	at android.arch.persistence.room.processor.PojoProcessor.process(PojoProcessor.kt:101)
	at android.arch.persistence.room.processor.EntityProcessor.doProcess(EntityProcessor.kt:68)
	at android.arch.persistence.room.processor.EntityProcessor.access$doProcess(EntityProcessor.kt:50)
	at android.arch.persistence.room.processor.EntityProcessor$process$1.invoke(EntityProcessor.kt:57)
	at android.arch.persistence.room.processor.EntityProcessor$process$1.invoke(EntityProcessor.kt:50)
	at android.arch.persistence.room.processor.cache.Cache$Bucket.get(Cache.kt:46)
	at android.arch.persistence.room.processor.EntityProcessor.process(EntityProcessor.kt:56)
	at android.arch.persistence.room.processor.DatabaseProcessor.processEntities(DatabaseProcessor.kt:248)
	at android.arch.persistence.room.processor.DatabaseProcessor.doProcess(DatabaseProcessor.kt:63)
	at android.arch.persistence.room.processor.DatabaseProcessor.process(DatabaseProcessor.kt:53)
	at android.arch.persistence.room.RoomProcessor$DatabaseProcessingStep.process(RoomProcessor.kt:57)
	at com.google.auto.common.BasicAnnotationProcessor.process(BasicAnnotationProcessor.java:318)
	at com.google.auto.common.BasicAnnotationProcessor.process(BasicAnnotationProcessor.java:171)
	at org.jetbrains.kotlin.kapt3.ProcessorWrapper.process(annotationProcessing.kt:131)
	at com.sun.tools.javac.processing.JavacProcessingEnvironment.callProcessor(JavacProcessingEnvironment.java:794)
	at com.sun.tools.javac.processing.JavacProcessingEnvironment.discoverAndRunProcs(JavacProcessingEnvironment.java:705)
	at com.sun.tools.javac.processing.JavacProcessingEnvironment.access$1800(JavacProcessingEnvironment.java:91)
	at com.sun.tools.javac.processing.JavacProcessingEnvironment$Round.run(JavacProcessingEnvironment.java:1035)
	at com.sun.tools.javac.processing.JavacProcessingEnvironment.doProcessing(JavacProcessingEnvironment.java:1176)
	at com.sun.tools.javac.main.JavaCompiler.processAnnotations(JavaCompiler.java:1170)
	at com.sun.tools.javac.main.JavaCompiler.processAnnotations(JavaCompiler.java:1068)
	at org.jetbrains.kotlin.kapt3.AnnotationProcessingKt.doAnnotationProcessing(annotationProcessing.kt:87)
	at org.jetbrains.kotlin.kapt3.AnnotationProcessingKt.doAnnotationProcessing$default(annotationProcessing.kt:45)
	at org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.runAnnotationProcessing(Kapt3Extension.kt:257)
	at org.jetbrains.kotlin.kapt3.AbstractKapt3Extension.analysisCompleted(Kapt3Extension.kt:212)
	at org.jetbrains.kotlin.kapt3.ClasspathBasedKapt3Extension.analysisCompleted(Kapt3Extension.kt:95)
	at org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM$analyzeFilesWithJavaIntegration$2.invoke(TopDownAnalyzerFacadeForJVM.kt:97)
	at org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration(TopDownAnalyzerFacadeForJVM.kt:107)
	at org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration$default(TopDownAnalyzerFacadeForJVM.kt:84)
	at org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler$analyze$1.invoke(KotlinToJVMBytecodeCompiler.kt:374)
	at org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler$analyze$1.invoke(KotlinToJVMBytecodeCompiler.kt:64)
	at org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport.analyzeAndReport(AnalyzerWithCompilerReport.kt:101)
	at org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze(KotlinToJVMBytecodeCompiler.kt:365)
	at org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules$cli(KotlinToJVMBytecodeCompiler.kt:130)
	at org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute(K2JVMCompiler.kt:161)
	at org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute(K2JVMCompiler.kt:63)
	at org.jetbrains.kotlin.cli.common.CLICompiler.execImpl(CLICompiler.java:107)
	at org.jetbrains.kotlin.cli.common.CLICompiler.execImpl(CLICompiler.java:51)
	at org.jetbrains.kotlin.cli.common.CLITool.exec(CLITool.kt:96)
	at org.jetbrains.kotlin.daemon.CompileServiceImpl$compile$1$1$2.invoke(CompileServiceImpl.kt:405)
	at org.jetbrains.kotlin.daemon.CompileServiceImpl$compile$1$1$2.invoke(CompileServiceImpl.kt:98)
	at org.jetbrains.kotlin.daemon.CompileServiceImpl$doCompile$$inlined$ifAlive$lambda$2.invoke(CompileServiceImpl.kt:920)
	at org.jetbrains.kotlin.daemon.CompileServiceImpl$doCompile$$inlined$ifAlive$lambda$2.invoke(CompileServiceImpl.kt:98)
	at org.jetbrains.kotlin.daemon.common.DummyProfiler.withMeasure(PerfUtils.kt:137)
	at org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile(CompileServiceImpl.kt:950)
	at org.jetbrains.kotlin.daemon.CompileServiceImpl.doCompile(CompileServiceImpl.kt:919)
	at org.jetbrains.kotlin.daemon.CompileServiceImpl.compile(CompileServiceImpl.kt:404)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at sun.rmi.server.UnicastServerRef.dispatch(UnicastServerRef.java:346)
	at sun.rmi.transport.Transport$1.run(Transport.java:200)
	at sun.rmi.transport.Transport$1.run(Transport.java:197)
	at java.security.AccessController.doPrivileged(Native Method)
	at sun.rmi.transport.Transport.serviceCall(Transport.java:196)
	at sun.rmi.transport.tcp.TCPTransport.handleMessages(TCPTransport.java:568)
	at sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run0(TCPTransport.java:826)
	at sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.lambda$run$0(TCPTransport.java:683)
	at java.security.AccessController.doPrivileged(Native Method)
	at sun.rmi.transport.tcp.TCPTransport$ConnectionHandler.run(TCPTransport.java:682)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
	at java.lang.Thread.run(Thread.java:745)
Caused by: java.lang.ClassNotFoundException: org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil
	at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
	... 77 more
```
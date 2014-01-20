### build
* git clone git@github.com:syncsynchalt/cobertura-groovy-testcase.git
* cd cobertura-groovy-testcase
* mvn clean cobertura:cobertura

### symptoms

Warning during instrumentation:
```
[INFO] --- cobertura-maven-plugin:2.6:instrument (default-cli) @ testcase-code ---
[INFO] Cobertura 2.0.3 - GNU GPL License (NO WARRANTY) - See COPYRIGHT file
[cobertura] WARN  [main] net.sourceforge.cobertura.instrument.CoberturaInstrumenter - Unable to instrument file /Users/mdriscoll/cobertura-groovy-testcase/code/target/generated-classes/cobertura/testcase/GroovyClosureClass$_reach_closure1.class
java.lang.IllegalArgumentException: Invalid access flags: 32
    at org.objectweb.asm.util.CheckClassAdapter.checkAccess(Unknown Source)
    at org.objectweb.asm.util.CheckClassAdapter.visitInnerClass(Unknown Source)
    at org.objectweb.asm.ClassVisitor.visitInnerClass(Unknown Source)
    at org.objectweb.asm.ClassReader.accept(Unknown Source)
    at org.objectweb.asm.ClassReader.accept(Unknown Source)
    at net.sourceforge.cobertura.instrument.CoberturaInstrumenter.instrumentClass(CoberturaInstrumenter.java:153)
    at net.sourceforge.cobertura.instrument.CoberturaInstrumenter.instrumentClass(CoberturaInstrumenter.java:121)
    at net.sourceforge.cobertura.instrument.CoberturaInstrumenter.addInstrumentationToSingleClass(CoberturaInstrumenter.java:234)
    at net.sourceforge.cobertura.instrument.Main.addInstrumentationToSingleClass(Main.java:298)
    at net.sourceforge.cobertura.instrument.Main.addInstrumentation(Main.java:307)
    at net.sourceforge.cobertura.instrument.Main.parseArguments(Main.java:399)
    at net.sourceforge.cobertura.instrument.Main.main(Main.java:421)
[cobertura] WARN  [main] net.sourceforge.cobertura.instrument.CoberturaInstrumenter - Unable to instrument file /Users/mdriscoll/cobertura-groovy-testcase/code/target/generated-classes/cobertura/testcase/GroovyClosureClass.class
java.lang.IllegalArgumentException: Invalid access flags: 32
    at org.objectweb.asm.util.CheckClassAdapter.checkAccess(Unknown Source)
    at org.objectweb.asm.util.CheckClassAdapter.visitInnerClass(Unknown Source)
    at org.objectweb.asm.ClassVisitor.visitInnerClass(Unknown Source)
    at org.objectweb.asm.ClassReader.accept(Unknown Source)
    at org.objectweb.asm.ClassReader.accept(Unknown Source)
    at net.sourceforge.cobertura.instrument.CoberturaInstrumenter.instrumentClass(CoberturaInstrumenter.java:153)
    at net.sourceforge.cobertura.instrument.CoberturaInstrumenter.instrumentClass(CoberturaInstrumenter.java:121)
    at net.sourceforge.cobertura.instrument.CoberturaInstrumenter.addInstrumentationToSingleClass(CoberturaInstrumenter.java:234)
    at net.sourceforge.cobertura.instrument.Main.addInstrumentationToSingleClass(Main.java:298)
    at net.sourceforge.cobertura.instrument.Main.addInstrumentation(Main.java:307)
    at net.sourceforge.cobertura.instrument.Main.parseArguments(Main.java:399)
    at net.sourceforge.cobertura.instrument.Main.main(Main.java:421)

[ERROR] Jan 19, 2014 6:26:38 PM net.sourceforge.cobertura.coveragedata.CoverageDataFileHandler saveCoverageData
INFO: Cobertura: Saved information on 2 classes.

[INFO] Instrumentation was successful.
```

Class `GroovyClosureClass` is missing from coverage report.

### versions
Here are various versions I have installed, if needed to reproduce things:

* `java version "1.7.0_45"`
* `Apache Maven 3.1.1 (0728685237757ffbf44136acec0402957f723d9a; 2013-09-17 09:22:22-0600)`
* OSX 10.9.1
```Darwin laika.local 13.0.0 Darwin Kernel Version 13.0.0: Thu Sep 19 22:22:27 PDT 2013; root:xnu-2422.1.72~6/RELEASE_X86_64 x86_64```

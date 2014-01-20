package testcase


class TestClass extends GroovyTestCase {
    void testJava() {
        def o = new JavaClass()
        o.reach()
    }

    void testGroovy() {
        def o = new GroovyClass()
        o.reach()
    }

    void testGroovyClosure() {
        def o = new GroovyClosureClass()
        o.reach()
    }
}

package testcase

public class GroovyClosureClass {
    void reach() {
        def closure = {
            println it
        }
        closure('Reached!')
    }
}

package demo

class BootStrap {

    def init = { servletContext ->

        def b = new Book(name: 'Petete')
        b.save(failOnError: true)

    }
    def destroy = {
    }
}

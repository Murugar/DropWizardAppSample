package com.iqmsoft

import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment

class TestApplication : Application<TestConfiguration>() {

    override fun getName(): String {
        return "Test"
    }

    override fun initialize(bootstrap: Bootstrap<TestConfiguration>) {
        // TODO: application initialization
    }

    override fun run(configuration: TestConfiguration,
                     environment: Environment) {
        // TODO: implement application
    }
}

fun main(args: Array<String>) {
    TestApplication().run(*args)
}


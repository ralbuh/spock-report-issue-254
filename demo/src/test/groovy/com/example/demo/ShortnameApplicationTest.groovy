package com.example.demo

import spock.lang.Specification

class ShortnameApplicationTest extends Specification {

    def "test"() {
        given: "1"
            def a = 1
        when: "+1"
            a=a+1
        then: "2"
            a==2
    }
}

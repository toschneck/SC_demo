package de.consol.sc.demo.microservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author tschneck
 *         Date: 09.12.14
 */
@Component
@ConfigurationProperties
public class FooProperties {

    private String foo;
    private String consol;
    private String password;

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public String getConsol() {
        return consol;
    }

    public void setConsol(String consol) {
        this.consol = consol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "FooProperties{" +
                "foo='" + foo + '\'' +
                ", consol='" + consol + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

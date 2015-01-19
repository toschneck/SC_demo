package de.consol.sc.demo.microservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tschneck
 *         Date: 08.12.14
 */
@RestController
public class HomeController {

    private final static Logger logger = LoggerFactory.getLogger(HomeController.class);
    @Autowired
    private FooProperties fooProperties;
    private int counter = 0;
//
//    @Autowired
//    private CloudConfig cloudConfig;

    @RequestMapping("/")
    public String home() {
        return String.format("Hello World! => foo='%s', consol ='%s'",
                fooProperties.getFoo(),
                fooProperties.getConsol()
        );
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Hello getHello() {
        counter++;
        Hello hello = new Hello("Hello World!", counter, fooProperties);
        logger.info("request:\n\n{}", hello);
        return hello;
    }


    private class Hello {
        private int counter;
        private String msg;
        private FooProperties fooProperties;

        public Hello(String msg, int counter, FooProperties fooProperties) {
            this.counter = counter;
            this.msg = msg;
            this.fooProperties = fooProperties;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public FooProperties getFooProperties() {
            return fooProperties;
        }

        public void setFooProperties(FooProperties fooProperties) {
            this.fooProperties = fooProperties;
        }

        public int getCounter() {
            return counter;
        }

        public void setCounter(int counter) {
            this.counter = counter;
        }

        @Override
        public String toString() {
            return "Hello{" +
                    "counter=" + counter +
                    ", msg='" + msg + '\'' +
                    ", fooProperties=" + fooProperties +
                    '}';
        }
    }

//    @RequestMapping("/config")
//    public ApplicationInstanceInfo config(){
//        return cloudConfig.applicationInfo();
//    }
}

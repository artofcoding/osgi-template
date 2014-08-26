package eu.artofcoding.osgitemplate.impl;

import eu.artofcoding.osgitemplate.api.MyData;
import eu.artofcoding.osgitemplate.api.MyService;

public class MyServiceImpl implements MyService {

    @Override
    public String sayHello(MyData myData) {
        String s = String.format("Hello from %s#sayHello(), %s %s", this, myData.getFirstname(), myData.getLastname());
        return s;
    }

}

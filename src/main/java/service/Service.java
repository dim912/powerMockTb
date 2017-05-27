package service;

import util.Logger;

public class Service{


    public String serviceMethod(){

        Logger.logExtra("Service");

        return Logger.log("testString");

    }


}
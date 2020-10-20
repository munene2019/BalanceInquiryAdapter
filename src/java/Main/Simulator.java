/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import DB.DBFunctions;
import DB.DBconnection;
import commonOperations.Utilities;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/**
 *
 * @author rmunene
 */
public class Simulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DBFunctions db = new DBFunctions();
        // TODO code application logic here
        String name = "";
        Map<String, String> request = new HashMap<>();
        Map<String, String> requestMap = new HashMap<>();

        request.put("name", "rogers");
        request.put("ID", "23323");
        int nationalID = 373883;

//        JSONObject json = new JSONObject(request);
//        requestMap = (new Utilities()).parseJSON(json, requestMap);
//        name = requestMap.get("name");
//int nationalID,String firstName,String lastName,int accountNo
 int nationalid = 3627273;
       String phoneNumber = "254712622099";
       String pin = "12345";
        String uuid = "1234";
        String lastName = "Nkirote";
         String firsname = "Edith";
//String phoneNumber, String pin
      db.balanceInquiry(phoneNumber);
       //nationalID, String firstName, String lastName, String phonenumber,String uuid
        // db.customerRegistration(nationalid, firsname,lastName,phoneNumber,uuid);
        
        
    }

}

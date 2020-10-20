/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rmunene
 */
public class DBFunctions {
/**
 *
 * balanceInquiry used to fetch balance from the database
 */
    public Map<String, String> balanceInquiry(String phonumber) {
        DBconnection db = new DBconnection();
        Map<String, String> requestMap = new HashMap<>();
        String sql = "SELECT AvailableBal,ActualBal FROM tbaccounts  WHERE PhoneNumber=?";
        try (Connection connection = db.Connect();                 

                PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, phonumber);
            ps.executeQuery();
            try (ResultSet rs = ps.getResultSet()) {
                if (rs.next()) {
                    requestMap.put("Request", "Balance Inquiry");
                    requestMap.put("AvailableBal", rs.getString("AvailableBal"));
                    requestMap.put("ActualBal", rs.getString("ActualBal"));
                    requestMap.put("status", "1");
                } else {
                    requestMap.put("status", "0");
                }
            }
        } catch (SQLException ex) {
            // log
        }
        return requestMap;
    }

    
}

package com.vastika.jdbcdemo.basic.ps;

import com.vastika.jdbcdemo.basic.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDemo {
    public static final String SQL="select * from user_tbl";
    public static void main(String[] args) {

        try(

                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);

        ) {
            ResultSet rs = ps.executeQuery(SQL);
            while(rs.next()){
                System.out.println("+++++++");
                System.out.println("Id is :" +rs.getInt("id"));
                System.out.println("User name is :" +rs.getString("user_name"));
                System.out.println("Password is :" +rs.getString("password"));
                System.out.println("+++++++");
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

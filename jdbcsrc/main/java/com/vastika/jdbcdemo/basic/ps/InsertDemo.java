package com.vastika.jdbcdemo.basic.ps;

import com.vastika.jdbcdemo.basic.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {
    public static final String SQL="insert into user_tbl(user_name, password)values(?,?)";

    public static void main(String[] args) {

        try(

                PreparedStatement ps =DbUtil.getConnection().prepareStatement(SQL);

        ) {
ps.setString(1,"raj");
            ps.setString(2,"eertgg");
            ps.executeUpdate() ;
            System.out.println("data inserted");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

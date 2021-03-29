package com.vastika.jdbcdemo.basic.st;

import com.vastika.jdbcdemo.basic.util.DbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

    public static final String SQL="insert into user_tbl(user_name, password)values('hari','r14236')";

    public static void main(String[] args) {

        try(
                //can alodo in 1 line
                //Statement st =Dbutil.getConnection().createStatement();
                Connection con = DbUtil.getConnection();
                Statement st=con.createStatement();
        ) {

            st.executeUpdate(SQL) ;
            System.out.println("data inserted");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

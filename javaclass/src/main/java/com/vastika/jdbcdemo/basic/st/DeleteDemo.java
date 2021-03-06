package com.vastika.jdbcdemo.basic.st;

import com.vastika.jdbcdemo.basic.util.DbUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDemo {
    public static final String SQL="delete from user_tbl where id=3";

    public static void main(String[] args) {

        try(

                Connection con = DbUtil.getConnection();
                Statement st=con.createStatement();

        ) {

            st.executeUpdate(SQL) ;
            System.out.println("data deleted");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

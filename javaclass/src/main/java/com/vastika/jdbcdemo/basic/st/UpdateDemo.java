package com.vastika.jdbcdemo.basic.st;

import com.vastika.jdbcdemo.basic.util.DbUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {
    public static final String SQL="update user_tbl set user_name='krishna', password='tt@#' where id =2";

    public static void main(String[] args) {

        try(

                Connection con = DbUtil.getConnection();
                Statement st=con.createStatement();

        ) {

            st.executeUpdate(SQL) ;
            System.out.println("data updated");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

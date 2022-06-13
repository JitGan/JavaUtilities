package com.codewithjit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnection {
    public static void main(String args[]){

        try{

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Loaded the driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/record_company1?characterEncoding=latin1&useConfigs=maxPerformance","root","warlock72!");
            System.out.println("Got the connection:"+con);


            Statement insert = con.createStatement();
            System.out.println("Updating Bands");
            insert.executeUpdate("INSERT INTO bands (name) VALUES ('The Beetles')");

            Statement stmt=con.createStatement();
            System.out.println("Got the statement:"+stmt);
            ResultSet rs=stmt.executeQuery("select * from bands");
            System.out.println("Got the result set");


            while(rs.next())
                System.out.println(rs.getInt(1)+"  "
                        +rs.getString(2)+"  "
                        //+rs.getString(3)
                );


            con.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e);}
    }
}

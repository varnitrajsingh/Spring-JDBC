import java.net.StandardSocketOptions;
import java.sql.*;
import java.util.Scanner;

public class Main {
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root";
    private static final String password = "123456";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e){
            System.out.print(e.getMessage());
        }

        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            //Statement statement = connection.createStatement();
            Scanner sc = new Scanner(System.in);



            String query = "SELECT MARKS FROM STUDENTS WHERE ID = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setString(1, "ankita");
//            preparedStatement.setInt(2, 25);
//            preparedStatement.setDouble(3, 78);
            preparedStatement.setInt(1, 1);


            //to update any data in the datatbase:
            // String query = String.format("UPDATE STUDENTS SET MARKS = %f WHERE ID = %d", 88.8, 2);
//          String query = String.format("DELETE FROM STUDENTS WHERE ID = 2");

            // to insert new data in the database:
//          String query = String.format("INSERT INTO STUDENTS(NAME, AGE, MARKS) VALUES('%s', %o, %f)" , "Rahul", 23, 75.6);


//            int rowsAffected = preparedStatement.executeUpdate();   //this willbe used when we need to set/delete/update the data
//            if(rowsAffected > 0){
//                System.out.print("data inserted successfully");
//            }else{
//                System.out.print("not updated");
//            }


//            ResultSet resultSet = preparedStatement.executeQuery();
//            if(resultSet.next()){
//                double marks = resultSet.getDouble("marks");
//                System.out.print("marks: "+ marks);
//            }else{
//                System.out.print("marks not found");
//            }




            // to show values in the databse:
//            ResultSet resultSet = statement.executeQuery(query); //this will be used when data is retrieved
//            while(resultSet.next()){
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                int age = resultSet.getInt("age");
//                double marks = resultSet.getDouble("marks");
//                System.out.print("id: " + id + "name: " + name + "age: " + age + "marks: " + marks);
//
//            }
        }catch(SQLException e){
            System.out.print(e.getMessage());
        }
    }

}

import java.sql.*;
class Database_1
{
public static void main(String args[])throws Exception
{
Class.forName("org.sqlite.JDBC");
Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
Statement stm=con.createStatement();
ResultSet rs=stm.executeQuery("select * from dept");
int deptno;
String dname;

while(rs.next())
{



deptno=rs.getInt("deptno");
dname=rs.getString("dname");

System.out.println(deptno + " " + dname);


}
}
}
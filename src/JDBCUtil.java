import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//----------------------创建和关闭数据库的通用方法--------------------------------------
public class JDBCUtil{
    static{
        try{
            String driverName = "com.mysql.cj.jdbc.Driver";  ////com.mysql.jdbc.Driver 是 mysqlconnector‐java 5中的，com.mysql.cj.jdbc.Driver 是 mysql‐connector‐java 6以上的
            Class.forName(driverName);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static  Connection getConnection(){      //返回值为 (另一个包中的类）Connection的叫  getConnection的方法---创建数据库连接
        Connection con = null;                     //给一个空的对象  实例由getConnecton获得
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/student" + "?serverTimezone=GMT%2B8","root","");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void close(ResultSet rs, Statement statement,Connection con){  //关闭数据库连接

        try{
            if (rs != null)
                rs.close();
        } catch (Exception e){
            e.printStackTrace();
        }

        try{
            if (con != null)
                con.close();
        } catch (Exception e){
            e.printStackTrace();
        }

        try{
            if (statement != null)
                statement.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

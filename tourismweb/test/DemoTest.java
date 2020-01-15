import com.itdr.pojo.Users;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class DemoTest {
    public static void main(String[] args) throws SQLException {
//        QueryRunner qr = new QueryRunner(new ComboPooledDataSource());
//        Users query = qr.query("SELECT * FROM bishe_user where id=?", new BeanHandler<Users>(Users.class), 1);
//        System.out.println(query.getUsername());
        int i = 5;
        int j = 10;
        System.out.println(~j);
    }
}

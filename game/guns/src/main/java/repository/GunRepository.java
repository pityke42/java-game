package repository;

import data.Gun;
import service.LoadService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GunRepository {
    String url = "jdbc:mysql://localhost:3306/game_base";
    String user = "root";
    String password = "example";
    Connection connection = null;
    public GunRepository(){
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("kapcsolat fasza");
        } catch (SQLException e){
            System.out.println("gatya");
        }
    }
    public List<Gun> getAllGuns() throws SQLException {
        List<Gun> guns = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from gun");
        while (resultSet.next()){
            LoadService.getProperGunInstance(guns, new String[]{resultSet.getString("type"),
                    resultSet.getString("model"), resultSet.getString("mag_size"),
                    resultSet.getString("shooting_range"), resultSet.getString("damage"),
                    resultSet.getString("fire_rate"), resultSet.getString("accuracy"),
                    resultSet.getString("reload_time"), resultSet.getString("double_barrel"),
                    resultSet.getString("spread"), resultSet.getString("silencer"),
                    resultSet.getString("scope"), resultSet.getString("tripod"),
                    resultSet.getString("weight"),
                    resultSet.getString("id")});
        }
        return guns;
    }
}

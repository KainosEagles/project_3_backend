package org.example.daos;

import org.example.models.*;

import java.sql.*;

public class AuthDao {

    public User getUser(LoginRequest loginRequest) throws SQLException {
        try (Connection connection = DatabaseConnector.getConnection()) {

            String query = "SELECT Username, Password, role_id FROM `User` "
                    + "WHERE Username = ? and Password = ?;";
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, loginRequest.getUsername());
            statement.setString(2, loginRequest.getPassword());

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                return new User(
                        resultSet.getString("Username"),
                        resultSet.getString("Password"),
                        resultSet.getInt("role_id"));
            }
        }
        return null;
    }


    public int createUser(RegisterRequest user) throws SQLException {
        Connection c = DatabaseConnector.getConnection();

        String insertStatement = "INSERT INTO `User` (Username, Password, role_id) VALUES (?,?, 2);";

        PreparedStatement st = c.prepareStatement(insertStatement, Statement.RETURN_GENERATED_KEYS);

        st.setString(1, user.getUsername());
        st.setString(2, user.getPassword());

        return st.executeUpdate();

    }

}

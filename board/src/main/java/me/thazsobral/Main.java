package me.thazsobral;

import java.sql.SQLException;

import me.thazsobral.persistence.migrations.MigrationStrategy;

import static me.thazsobral.persistence.configs.ConnectionConfig.getConnection;

public class Main {
    public static void main(String[] args) {
        try (
            var connection = getConnection();
        ) {
            new MigrationStrategy(connection).executeMigration();
            System.out.println("Ok");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
package org.example.models;

import org.eclipse.jetty.server.Authentication;

import java.util.Map;

public class UserRole {

    public static final String HR = "hr";
    public static final String MANAGEMENT = "management";
    public static final String SALES = "sales";
    public static final String DELIVERY = "sales";
    public static final String TEAMLEAD = "teamlead";
    int id;

    private static final Map<Integer, String> rolesMap = Map.of(
            1, HR,
            2, MANAGEMENT,
            3, SALES,
            4, DELIVERY,
            5, TEAMLEAD
    );

    public UserRole(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return rolesMap.get(getId());
    }

}

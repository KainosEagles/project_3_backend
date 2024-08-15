package org.example.models;

public class ClientWithDetails {
    private final int id;
    private final String name;
    private final String salesEmployee;
    private final String projects;

    public ClientWithDetails(int id,
                             String name,
                             String sales_employee,
                             String projects) {
        this.id = id;
        this.name = name;
        this.salesEmployee = sales_employee;
        this.projects = projects;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProjects() {
        return projects;
    }

    public String getSalesEmployee() {
        return salesEmployee;
    }
}

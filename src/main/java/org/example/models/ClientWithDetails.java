package org.example.models;

public class ClientWithDetails {
    private final int id;
    private final String name;
    private final String salesEmployee;
    private final String projects;

    public ClientWithDetails(final int id,
                             final String name,
                             final String salesEmployee,
                             final String projects) {
        this.id = id;
        this.name = name;
        this.salesEmployee = salesEmployee;
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

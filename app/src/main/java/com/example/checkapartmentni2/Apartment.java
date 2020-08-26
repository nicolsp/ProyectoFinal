package com.example.checkapartmentni2;

public class Apartment {

    private String buildingName;  // Nombre del edificio
    private String projectName;   // Nombre del Proyecto
    private String unitId;        // Numero de unidad o departamento
    private String address;       // Dirección
    private String urlImageBuilding;  // url de imagen del edificio

    public Apartment(String buildingName, String projectName, String unitId,
                     String address, String urlImageBuilding) {
        this.buildingName = buildingName;
        this.projectName = projectName;
        this.unitId = unitId;
        this.address = address;
        this.urlImageBuilding = urlImageBuilding;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUrlImageBuilding() {
        return urlImageBuilding;
    }

    public void setUrlImageBuilding(String urlImageBuilding) {
        this.urlImageBuilding = urlImageBuilding;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "buildingName='" + buildingName + '\'' +
                ", projectName='" + projectName + '\'' +
                ", unitId='" + unitId + '\'' +
                ", address='" + address + '\'' +
                ", urlImageBuilding='" + urlImageBuilding + '\'' +
                '}';
    }
}


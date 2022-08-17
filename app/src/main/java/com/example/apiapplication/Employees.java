package com.example.apiapplication;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

public class Employees implements Serializable {
  private List<? extends EmployeeData> data;

  private String message;

  private String status;

  public List<? extends EmployeeData> getData() {
    return this.data;
  }

  public void setData(List<? extends EmployeeData> data) {
    this.data = data;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


}

package com.tcs.pojo;


import java.util.List;

public class Teacher {

  private long id;
  private String name;
  private List<Student> stuList;

  public List<Student> getStuList() {
    return stuList;
  }

  public void setStuList(List<Student> stuList) {
    this.stuList = stuList;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Teacher{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", stuList=" + stuList +
            '}';
  }
}

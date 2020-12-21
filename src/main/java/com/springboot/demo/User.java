package com.springboot.demo;


import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import java.util.List;

@Document(indexName="userindex")
public class User {
    @Id
    private Long id;
    private String first_name;
    private String last_name;
    private int age;
    private String about;
    private List<String> interests;

    //get、set方法省略
    @Override
    public String toString() {
        return "User[id=" + id +",first_name=" + first_name + ", last_name=" + last_name + ", age=" + age + ", about =" + about + ", interests=" + interests + "]";
    }
}

package com.SpringBootMongodb.Springboot_Mongodb.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Document(collection="StudentData")
public class Product {


    @Id
    private String id;
    @NotNull
    private Integer rollNo;
    @NotNull
    private String stuName;
    @NotNull
    private Object bookNo;
    @NotNull
    private Object bookName;
    @NotNull
    @Max(value = 3, message = "must be equal or less than 3")
    @Min(value=0,message = "must be 0 or greater")
    private Integer noOfBooks;


}

package com.thinkpad.wbdjavaexamc0718G1vutiendat.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotEmpty(message = "Tên không được để trống")
    @Size(min = 2,max = 30,message = "Tên có độ dài ngắn nhất là 2 kí tự và không dài quá 30 kí tự")
    private String name;
    @NotEmpty(message = "Giới tính chưa được chọn!")
    private String gender;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "Ngày sinh không được để trống")
    private Date dayOfBirth;
    @Pattern(regexp = "^0[38759][0-9]{8}$",message = "Số điện thoại không đúng!")
    private String phoneNumber;
    @NotEmpty(message = "Số CMND không được để trống")
    @Pattern(regexp = "^0[0-9]{11}$",message = "Số CMND không đúng!")
    private String idCard;
    @NotEmpty(message = "Email không được để trống")
    @Pattern(regexp = "^@*.*$",message = "Email không đúng!")
    private String email;
    @NotEmpty(message = "Địa chỉ không được để trống")
    private String address;

    @ManyToOne
    @JoinColumn(name = "groupEmployeeId")
    private GroupEmployee groupEmployee;
    public Employee() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(Date dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public GroupEmployee getGroupEmployee() {
        return groupEmployee;
    }

    public void setGroupEmployee(GroupEmployee groupEmployee) {
        this.groupEmployee = groupEmployee;
    }
}

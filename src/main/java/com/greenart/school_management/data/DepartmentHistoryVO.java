package com.greenart.school_management.data;

import java.util.Date;

import lombok.Data;

@Data
public class DepartmentHistoryVO {
    private Integer deph_seq;
    private String deph_type;
    private String deph_content;
    private Date deph_reg_dt;
    private Integer deph_di_seq;
}

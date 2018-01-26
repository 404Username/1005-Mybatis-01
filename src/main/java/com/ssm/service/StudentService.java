package com.ssm.service;

import com.ssm.damain.BaseResult;
import com.ssm.damain.Student;
import com.ssm.page.PageBean;

import java.util.List;

/**
 * Created by dllo on 18/1/26.
 */
public interface StudentService {
    List<Student> selectAll();

/*
* 分页查询
* pageIndex 页码  从0开始
* pageSize 每页显示的条数
* @return  返回
*
* */
   BaseResult<Student> pageSelect(int pageIndex,int pageSize,Student student);

}

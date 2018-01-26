package com.ssm.mapper;

import com.ssm.damain.Student;
import com.ssm.page.PageBean;

import java.util.List;

/**
 * Created by dllo on 18/1/26.
 */
//student 操作的对外接口声明
public interface StudentMapper {
    /*
    * 查询所有学生列表
    * 1方法宁对应student.xml中的id属性
    * 2方法参数对应的student.xml
    * */
    List<Student> selectAll();

    //分页查询   pageBean 包含分页信息对象
    List<Student> pageSelect(PageBean<Student> pageBean);

    //获取学生表总条数
    Integer getTotalRecord(PageBean<Student> pageBean);
}

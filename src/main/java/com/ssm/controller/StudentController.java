package com.ssm.controller;

import com.ssm.damain.BaseResult;
import com.ssm.damain.Student;
import com.ssm.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 18/1/25.
 */
@Controller
public class StudentController {
    //声明service层对外借口对象
   @Resource
    private StudentService studentService;


//
    @RequestMapping({"","/"})
    public String index(){
        return "index";
    }
    //获取学生列表 数据 用于前段页面表格显示
    @RequestMapping("/searchStudent")
    @ResponseBody
    public BaseResult<Student> searchStudent(){
        List<Student> students=studentService.selectAll();
        //结果进行封装
        BaseResult<Student> result=new BaseResult<Student>();
        result.setTotal(100);//中记录数
        result.setData(students);//设置当夜显示数据
        return result;
    }
    /*
    * 分页查询
    * pageIndex和pageSize分别是miniui前段传递过来的参数
    * student 接收前端页面传过来的参数
    * */


    @RequestMapping("findStudent")
    @ResponseBody
    public BaseResult<Student> findStudent(int pageIndex,int pageSize,Student student){
        BaseResult<Student> result=studentService.pageSelect(pageIndex,pageSize,student);
        return result;

    }
}

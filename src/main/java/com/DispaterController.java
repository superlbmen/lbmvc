package com;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 前端控制器
 * Created by liubo on 2017/8/6.
 */
public class DispaterController extends HttpServlet{

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response){
        System.out.println("throw Dispater Controller");
    }

}

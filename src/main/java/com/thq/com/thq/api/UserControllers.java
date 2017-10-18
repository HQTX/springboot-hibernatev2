package com.thq.com.thq.api;

import com.thq.entry.Tuser;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by THQ
 * 2017/10/18.
 */
@RestController
@RequestMapping("/demo")
public class UserControllers {

  /*  @ApiOperation(value="获取所有用户详细信息",notes="获取用户列表信息")
     @RequestMapping(value = "/getUsers", method = RequestMethod.GET)
     public List user(String name) {
        List<Tuser> list = new ArrayList<>();
        Tuser user = userService.findByName(name);
        list.add(user);
        return list;
        }*/


    @ApiOperation(value="删除指定id用户", notes="根据id来删除用户信息")
    @ApiImplicitParam(name = "id",value = "用户id", dataType = "java.lang.Long", paramType = "path")
    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable Long id){
        System.out.println("delete user:"+id);
        return "OK";
    }
}

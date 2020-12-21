package com.springboot.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.springboot.demo.User;
import com.springboot.entity.Unwind;
import com.springboot.mapper.UserInfoService;
import com.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.query.GetQuery;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EsTest {

    private ElasticsearchOperations elasticsearchOperations;

    @Autowired
    private UserInfoService userInfoService;

    @NacosValue(value = "${useLocalCache:false}", autoRefreshed = true)
    private boolean useLocalCache;

    public EsTest(ElasticsearchOperations elasticsearchOperations) {
        this.elasticsearchOperations = elasticsearchOperations;
    }

    @RequestMapping("t")
    public String getData() {
        Unwind unwind = userInfoService.getById(1);
        System.out.println(unwind);


        GetQuery byId = GetQuery.getById("3".toString());
        User user = elasticsearchOperations
                .queryForObject(GetQuery.getById("3".toString()), User.class);

        return user.toString();
    }


    @RequestMapping("get")
    @ResponseBody
    public boolean get() {
        return useLocalCache;
    }
}

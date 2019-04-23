package com.lynn.feign;

import org.springframework.stereotype.Component;

/**
 * Created by admin on 2019/4/22.
 */
@Component
public class ApiServiceError implements ApiService {

    @Override
    public String index() {
        return "服务发生故障！";
    }
}

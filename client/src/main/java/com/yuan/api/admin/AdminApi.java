package com.yuan.api.admin;


import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author kclee
 */
@FeignClient(value = "admin")
public interface AdminApi {
}

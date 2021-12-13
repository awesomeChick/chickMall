package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * feign远程调用
 * 1.注解FeignClient，服务名
 * 2.方法完整签名和完整请求路径
 * 3.开启远程调用
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    R membercoupons();
}

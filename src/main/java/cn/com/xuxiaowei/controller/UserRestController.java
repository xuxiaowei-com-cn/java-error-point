package cn.com.xuxiaowei.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户 {@link RestController}
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@RestController
public class UserRestController {

    /**
     * 接收并返回数据
     *
     * @param user 用户
     * @return 返回 接收的数据
     */
    @PostMapping("/user")
    public User index(@RequestBody User user) {

        return user;
    }

    /**
     * 用户
     *
     * @author xuxiaowei
     * @since 0.0.1
     */
    @Data
    public static class User {

        /**
         * 用户名
         */
        private String username;

        /**
         * 测试字段
         */
        private String t;

        /**
         * 测试字段-年龄
         */
        @JsonProperty("tAge")
        private String tAge;

        /**
         * 测试字段-年龄-1
         */
        private String tAgeUnit;

        /**
         * 测试字段-年龄-2
         */
        private String tAgeBEnd;

        /**
         * 测试字段-年龄-3
         */
        private String ageBcEnd;

    }

}

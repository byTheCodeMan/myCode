//package com.chen.service.text;
//
//import lombok.SneakyThrows;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//
//@RestController
//@RequestMapping("/api/user")
//public class UserController {
//    @Resource
//    private UserService userService;
//
//    // @Validated用于验证字段的值
//    // @RequestBody 只能Post请求且 content-type=>application/json
//    @SneakyThrows
//    @PostMapping("/login")
//    public ApiResult login(@Validated @RequestBody LoginModel model) {
//        Thread.sleep(5);
//        final LoginUser user = userService.login(model.getUsername(), model.getPassword());
//
//        return ApiResult.success(user);
//    }
//}

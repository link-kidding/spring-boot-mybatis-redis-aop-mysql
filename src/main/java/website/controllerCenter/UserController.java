package website.controllerCenter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import website.Service.CheckUserServer;
import website.entity.ResponseDto;
import website.entity.User;
import website.responseJson.ResEncapsulation;
import website.tools.StringUtilUUID;

/**
 * Created by kidding on 2017/6/14.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private CheckUserServer checkUserServer;

    @Autowired
    private ResEncapsulation resEncapsulation;

    //用户登录
    @PostMapping("/login")
    public ResponseDto<User> userLogin(@RequestBody User user) {
        if(user != null){
            user.setId(StringUtilUUID.getStrUUID());
        }
        return resEncapsulation.responseDate(checkUserServer.checkoutLogin(user.getUsername(),user.getPassword()));
    }
    //添加用户
    @PostMapping("/user")
    public ResponseDto<User> addUser(@RequestBody User user) {
        return resEncapsulation.responseDate(checkUserServer.addSaveUser(user));
    }
    @GetMapping("/user")
    public ResponseDto<User> seatchUserByname(@Param("username") String username){
        return resEncapsulation.responseDate(checkUserServer.searchUserByName(username));
    }@GetMapping("/alluser")
    public ResponseDto<User> showUserList(){
        return resEncapsulation.responseDate(checkUserServer.resUserList());
    }
}

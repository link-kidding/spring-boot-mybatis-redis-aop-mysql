package website.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import website.entity.User;
import website.enums.ResMessageEnum;
import website.exception.ThrowServerException;
import website.interfaceMapper.UserMapper;
import website.tools.StringUtilUUID;

import java.util.List;

/**
 * Created by kidding on 2017/6/15.
 */
@Service
public class CheckUserServer {
    @Autowired
    private UserMapper userMapper;

    public User checkoutLogin(String username, String password) {
        User user;
        try{
            user = userMapper.findUserByName(username);
            if(user == null){
                throw new ThrowServerException(ResMessageEnum.FIND_ERR);
            }
        }catch (Exception e){
            throw new ThrowServerException(ResMessageEnum.UNKNOWN_ERROR);
        }
        return user;
    }
    public User addSaveUser(User user) {
        user.setId(StringUtilUUID.getStrUUID());
        try{
            if(userMapper.insertUser(user) != 1){
                throw new ThrowServerException(ResMessageEnum.INSERT_ERR);
            }
        }catch (Exception e){
            throw new ThrowServerException(ResMessageEnum.UNKNOWN_ERROR);
        }
        return null;
    }
    @Cacheable(value = "usercache",key = "#username")
    public User searchUserByName(String username){
        User user;
        try{
            user = userMapper.findUserByName(username);
            System.out.println("in db...");
            if(user == null) {
                throw new ThrowServerException(ResMessageEnum.FIND_ERR);
            }
        }catch (Exception e){
            throw new ThrowServerException(ResMessageEnum.UNKNOWN_ERROR);
        }
        return user;
    }
    @Cacheable(value = "usercache",keyGenerator = "keyGenerator")
    public List<User> resUserList(){
        System.out.println("in db...");
        return userMapper.findAllUser();
    }

}

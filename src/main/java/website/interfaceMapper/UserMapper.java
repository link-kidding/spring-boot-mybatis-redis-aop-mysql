package website.interfaceMapper;

import org.apache.ibatis.annotations.*;
import website.entity.User;

import java.util.List;

/**
 * Created by kidding on 2017/6/14.
 */
@Mapper
public interface UserMapper {

    /**
     *查询全部信息
     * @Param null
     * return list<User>
     * */
    @Select("select * from user")
    List<User>  findAllUser();
    /**
     * 根据用户名查询信息
     * @Param username
     * return User
     * */
    @Select("select * from user where username = #{username}")
    User findUserByName(@Param("username") String username);

    /**
    * 插入新数据(按对象)
    * @param User
    * return int status 1/0
    * */
    @Insert("insert into user (id,username,age,password) values (#{id},#{username},#{age},#{password})")
    int insertUser(User user);

    /**
     * delete user by username
     * return 删除的个数
     * */
    @Delete("delete from user where username = #{username}")
    int deleteUserByName(@Param("username") String username);

    /**
     * update user by username
     * */
    @Update("update user set password = #{password} where username = #{username}")
    int updateUserpasswordByName(User user);

}
